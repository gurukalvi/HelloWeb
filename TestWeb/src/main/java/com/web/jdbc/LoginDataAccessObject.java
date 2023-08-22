package com.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDataAccessObject {
	
	public boolean checkLogin(String username, String password) {
		String sqlQuery = "SELECT * FROM SchoolDB.login l where l.username=\""+username+"\" and l.password=\""+password+"\"";
		//DBConnection dbObject = new DBConnection();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return loginValid;
	}

}
