package com.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class LoginDataAccessObject {
	
	public boolean checkLogin(String username, String password) {
		String sqlQuery = "SELECT * FROM schooldb.login l where l.username=\""+username+"\" and l.password=\""+password+"\"";
		//DBConnection dbObject = new DBConnection()
		System.out.println("the sql query ="+sqlQuery);
		boolean loginValid= false;
		try {
			Connection conn= DBConnection.getConnection();
			PreparedStatement stat=conn.prepareStatement(sqlQuery);
			ResultSet result= stat.executeQuery();
			while (result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" status "+result.getString(3)+" user type role ="+result.getString(4));
				loginValid = true;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return loginValid;
	}
	public HashMap<String, String> getLoginDeatils(String username, String password) {
		HashMap<String, String>LoginDeatils=new HashMap<>();
		
		String sqlQuery = "SELECT * FROM testdb.login l where l.username=\""+username+"\" and l.password=\""+password+"\"";
		//DBConnection dbObject = new DBConnection()
		System.out.println("the sql query ="+sqlQuery);
		boolean loginValid= false;
		try {
			Connection conn= DBConnection.getConnection();
			PreparedStatement stat=conn.prepareStatement(sqlQuery);
			ResultSet result= stat.executeQuery();
			while (result.next()) {
				String userName=result.getString(1);
				String status=result.getString(3);
				String userType=result.getString(4);
				String userId=result.getString(7);
				
				System.out.println("userName "+ userName+" status "+status+" user type role ="+userType);
				LoginDeatils.put("userName",userName); 
				LoginDeatils.put("status",status); 
				LoginDeatils.put("userType",userType); 
				LoginDeatils.put("userId",userId); 
				

				loginValid = true;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return LoginDeatils;
	}


}
