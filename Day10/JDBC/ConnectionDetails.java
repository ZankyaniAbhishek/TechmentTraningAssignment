package com.Techment.Day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {

	public static Connection getConnected() throws ClassNotFoundException, SQLException {
		Class.forName(ConnectionProperty.DRIVER_NAME);
		Connection con=DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USERNAME,ConnectionProperty.PASSWORD);
		System.out.println("Successfully Connected");
		return con;
		
		
		}

}
