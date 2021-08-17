package com.Techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

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
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 90);
			ps.setString(2, "Rahul");
			ps.setInt(3, 24000);
			ps.execute();
			System.out.println("Executed");
			
		}
		catch (Exception e) {
			
		}
	}

}
