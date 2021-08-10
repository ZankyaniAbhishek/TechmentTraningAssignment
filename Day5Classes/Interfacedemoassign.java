package com.Techment.Day6Classes;

interface JdbcConnection
{
	void connection();
}
class Mysql implements JdbcConnection
{

	@Override
	public void connection() {
		System.out.println("It's My Sql Connection");
		// TODO Auto-generated method stub
		
	}	
}
class Oracle implements JdbcConnection
{
	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("It's Oracle Connection");
	}
}


public class Interfacedemoassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection connection = new Oracle();
		connection.connection();
	}

}
