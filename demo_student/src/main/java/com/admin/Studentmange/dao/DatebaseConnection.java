package com.admin.Studentmange.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatebaseConnection {
	
	private Connection con;

	public Connection getConnection() throws SQLException {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangement", "root", "thakurjay@23");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(con!=null)
		{
			System.out.println(" Database Connection succesfully");
		}
		else
		{
			System.out.println("Database Connection Error");	
		}
		return con;
	}

}
