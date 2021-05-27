package com.simplilearn.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployee {

	public static void main(String[] args) throws ClassNotFoundException {
		// Read Employee
		
		String url = "jdbc:mysql://localhost:3306/emsystem";
		String username = "root";
		String password = "root";
		
		try {
			
		// 1. Register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// 2. Create/get connection
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established!!!");
						
		// 3. Create Statement
			
			
			Statement stm = conn.createStatement();
			
		// 4. Execute query ->(create & Execute)
			
			String query = "select * from employees";
			ResultSet res = stm.executeQuery(query);
		
		// 5. Printing
			
			while(res.next()) {
				System.out.println(
						res.getInt("id")+"  " +
						res.getString("first_name")+"  "+
						res.getString("last_name")+"  "+
						res.getString("email")+"  "+
						res.getString("dept")+"  "+
						res.getDouble("salary"));
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}

