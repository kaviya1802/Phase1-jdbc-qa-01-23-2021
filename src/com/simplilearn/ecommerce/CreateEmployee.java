package com.simplilearn.ecommerce;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		// Ceating employee
		
		try {
			
			conn = DBConnection.initConnection(); //get connetion object
			
			stm = conn.createStatement(); //create statement
			
			String query = "INSERT INTO employees(id,first_name,last_name,email,dept,salary) "
					+ "VALUES(103, 'William' ,'Smith' ,'will.smith@gmail.com', 'Developer', 40000)";
			
			int rowsAffected = stm.executeUpdate(query);
			System.out.println(+rowsAffected+" rows affeced");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(stm != null) {
				stm.close();
			}if(conn !=null) {
				conn.close();
			}
		}

	}

}
