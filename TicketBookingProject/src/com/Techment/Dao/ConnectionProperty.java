package com.Techment.Dao;

public interface ConnectionProperty {

	public static final String  DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
	public static final String USERNAME="root";
	public static final String PASSWORD="@admin123";
	//Train findTrain(int tno);
}
