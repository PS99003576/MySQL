package com.ltts.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection getConnection() throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/roshan","root","root");
		
		return con;
		
	}
}
