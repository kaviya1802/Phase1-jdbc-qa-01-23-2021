package com.simplilearn.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		// Database connection
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		
		try {
			
		// 1. Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// 2. Create/get connection
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established!!!");
			
		// 3. Create Statement
			
			

			
		} catch (Exception e) {
			System.out.println("DB connection Failure!!");
		}finally {
			
		}

	}

	}

