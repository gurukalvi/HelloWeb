package com.web;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/RemarkDataServlet")
public class RemarkDataServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 String javaCode = request.getParameter("javaCode");
		 
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection connection= DriverManager.getConnection("jdbc:mysql://test-db.csse9hpx86cr.us-east-1.rds.amazonaws.com:3306/testdb","admin","MySql2023");
	            String insert_query = "INSERT INTO `testdb`.`marks`(`remark`) VALUES (?)";
	            PreparedStatement statement = connection.prepareStatement(insert_query);
	            statement.setString(1, javaCode);
	            statement.executeUpdate();
	            connection.close();
		 } catch (Exception e) {
	            e.printStackTrace();
	        }

	        response.sendRedirect("success.html"); // Redirect to a success page
	    }
	}