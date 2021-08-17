package com.Techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step-1 load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Driver Class Not Loaded ");
			
			//STep 2 Create The Connection
			String url ="jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
			Connection con =  DriverManager.getConnection(url, "root", "@admin123");
			System.out.println("Connected");
			
			Statement statement = con.createStatement();
			//statement.execute("insert into employee values(3,'Raghu',35000);");
			//System.out.println("Inserted");
			ResultSet rs =statement.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			//System.out.println(rs.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
