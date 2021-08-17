package com.Techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionDetails.getConnected();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
			
			}
				catch(Exception e) {
					e.printStackTrace();
				}


	}

}
