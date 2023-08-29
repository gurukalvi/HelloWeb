package com.web;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/StudentMarksServlet")
public class StudentMarksServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside the StudentMarks servlet");
		String tamil=req.getParameter("Tamil");
		String english=req.getParameter("English");
		String maths=req.getParameter("Maths");
		String science=req.getParameter("Science");
		String social=req.getParameter("Social");
		String computer=req.getParameter("Computer");
	
		System.out.println(" tamil="+tamil+" english="+english+" maths="+maths+" science="+science+" social="+social+" computer="+computer);
		  
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926", "sql6641926", "pG7bX7JQLi")) {
			  String insert_query = "INSERT INTO `sql6641926`.`marks` (`tamil`, `english`, `maths`, `science`, `social`, `computer`)VALUES (?,?,?,?,?,?)";
			  		
	            try (PreparedStatement preparedStatement = connection.prepareStatement(insert_query)) {
	                preparedStatement.setString(4, tamil);
	                preparedStatement.setString(5, english);
	                preparedStatement.setString(6, maths);
	                preparedStatement.setString(7, science);
	             	preparedStatement.setString(8, social);
	                preparedStatement.setString(9, computer);
	              	      
	                int rowsAffected = preparedStatement.executeUpdate();
	                if (rowsAffected >0) {
	                	System.out.println("Successfuly inserted");
	           
	                    resp.getWriter().write("Update successful");
	                } else {
	                    resp.getWriter().write("Update failed");
	                    System.out.println("failed inserted");
	                }
	    	            }
		  }catch (SQLException e) {
	            e.printStackTrace();
	            resp.getWriter().write("An error occurred");
	            System.out.println("Successfuly inserted");
	        }
		RequestDispatcher dispatcher = null;
		dispatcher = req.getRequestDispatcher("MySchool.html");
		dispatcher.forward(req, resp);
	}
}

