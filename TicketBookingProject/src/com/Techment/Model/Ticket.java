package com.Techment.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.Techment.Dao.ConnectionProperty;
import com.Techment.Dao.TicketDao;

public class Ticket implements TicketDao, ConnectionProperty {

	public static int pnrdConstant =101;
	@Override
	public Train findTrain(int tno) {
		try
		{
			Train train = null;
			Class.forName(DRIVER_NAME);
			//System.out.println(" Driver Class  Loaded ");
			
			//System.out.println("Block Came");
			Connection con =  DriverManager.getConnection(URL, "root", "@admin123");
			//System.out.println("Connected");				
			PreparedStatement ps=con.prepareStatement("select * from TRAINS where TRAIN_NO =? ");
			ps.setInt(1, tno);		
			ResultSet rs=ps.executeQuery();		
			while(rs.next())
			{//System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getInt(5));
			 train = new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			}		
			//System.out.println("Operation Successful");
			return train;			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return null;
		}
		
	}

	@Override
	public Map<Passenger, Double> addPassenger(Train train) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Passenger,Double> map = new HashMap<Passenger, Double>();
		List<Passenger> passengers = new ArrayList<Passenger>();
		System.out.println("Enter The Number of Passengers : ");
		int noofpassengers = scanner.nextInt();///////////////////////830241819
		for(int i =0;i<noofpassengers;i++)
		{
			System.out.println("Enter The Name "+(i+1)+" of The Passenger : ");
			String name = scanner.nextLine();
			name+=scanner.nextLine();
			System.out.println("Enter The Age of "+name+" : ");
			int age = scanner.nextInt();
			System.out.println("Enter The Gender (as M or F) of "+name+" : ");
			String gender = scanner.next();
			Passenger passenger = new Passenger(name, age, gender);
			passengers.add(passenger);
		}
		for(Passenger passenger : passengers)
		{
			double fare =train.getTickedPrice();
			if(passenger.getAge()<=12)
			{
				fare = (train.getTickedPrice()*.5);
				if(passenger.getGender().equals("F")||passenger.getGender().equals("f"))
				{
					fare = (fare-(fare*.25));
				}
				//return fare;
			}
			else if(passenger.getAge()>=60)
			{
				fare = (fare*.4);
				if(passenger.getGender().equals("F")||passenger.getGender().equals("f"))
				{
					fare = (fare-(fare*.25));
				}
				
					
				//return fare;
			}
			else {
				if(passenger.getGender().equals("F")||passenger.getGender().equals("f"))
				{
					fare = (fare-(fare*.25));
				}
				else
				fare = train.getTickedPrice();
				//return fare;
			}
			//System.out.println(fare);
			 Double d = fare;
			map.put(passenger, d );
		}
		
		scanner.close();
		return map;
		
		
		
		
	}

	@Override
	public double calcPassengerFare(Map<Passenger, Double> map) {
		double totalfare =0;
		for(Double d : map.values())
		{
			totalfare+=d;
		}
		
		return totalfare;
	}

	
	@Override
	public String generatePNR(Train train,LocalDate date)
	{
		String Id = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String pnr=(Character.toString(train.getSource().charAt(0))+Character.toString(train.getDestination().charAt(0))+"_"+Id+"_"+Integer.toString(pnrdConstant));
		pnrdConstant++;
		return pnr;
		
		//System.out.println("PNR NUmber is : "+train.getSource().charAt(0)+train.getDestination().charAt(0)+"_"+Id+"_"+pnrdConstant);		
		//System.out.println("CHecking Pnr 1 :"+pnr);
		//DateFormat dateFormat = new SimpleDateFormat("yyyymmdd"); 
		//System.out.println("Check");
		//String d = dateFormat.format(date);
		//2System.out.println("Check2");
		//System.out.println("PNR NUmber is : "+train.getSource().charAt(0)+train.getDestination().charAt(0)+"_"+date+"_"+pnrdConstant);
		//String pnr=(Character.toString(train.getSource().charAt(0))+Character.toString(train.getDestination().charAt(0))+"_"+date+"_"+Integer.toString(pnrdConstant));
	
	}

	@Override
	public void generateTicket(Train train,String Pnr,String date,Map<Passenger, Double> hashMap,Double TotalFare) {
		try
		{
		FileWriter writer = new FileWriter(Pnr +".txt");
		 BufferedWriter buffer = new BufferedWriter(writer);
		 String s1 = "PNR              : " + Pnr ;
		 String s2 = "Train no         : " + train.getTrainNo();
		 String s3 = "Train Name       : " +train.getTrainName();
		 String s4 = "Source  		   : " +train.getSource();
		 String s5 = "To               : " +train.getDestination();
		 String s6 = "Travel Date      : " +date;
		 String s7 = "\n\nPassengers       : ";
		 String s8="";
		 for(Entry<Passenger, Double> p : hashMap.entrySet())
		 {
			 s8 += "Name : " +p.getKey().getName()+"   Age : "+p.getKey().getAge()+"   Gender : "+p.getKey().getGender()+"    Fair : "+p.getValue() +"\n";
		 }
		 buffer.write(s1 +"\n"+s2 +"\n"+s3 +"\n"+s4 +"\n"+s5 +"\n"+s6 +"\n"+s7 +"\n"+s8 +"\n"+"Total Fare :"+ TotalFare);
		 buffer.close();
		 System.out.println("Operation Success");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		 
	}



	

	
}
