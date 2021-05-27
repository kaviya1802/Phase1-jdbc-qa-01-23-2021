package com.simplilearn.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static final String url = "jdbc:mysql://localhost:3306/emsystem";
	static final String username = "root";
	static final String password = "root";
	static final String JDBC_DRIVER= "com.mysql.cj.jdbc.Driver";
	
	public static Connection initConnection() {
		Connection conn = null;
		try {
					
			//Create/get connection
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established!!!");
			
		} catch (Exception e) {
			System.out.println("DB Connection Failure!!!");
		}
		return conn;
	}
		
	}
