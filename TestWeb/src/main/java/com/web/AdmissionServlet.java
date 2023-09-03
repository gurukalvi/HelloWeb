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

@WebServlet("/AdmissionServlet")
public class AdmissionServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside the admission servlet");
		String name=req.getParameter("FirstName");
		String initial=req.getParameter("Initial");
		String studentid=req.getParameter("StudentID");
		String rollnumber=req.getParameter("RollNO");
		String qualification=req.getParameter("Qualification");
		String mobilenumber=req.getParameter("Mobile Number");
		String email=req.getParameter("EmailID");
		String cgpa=req.getParameter("CGPA");
		String dob=req.getParameter("DOB");
		String year=req.getParameter("Year");
		System.out.println(" name="+name+" initial="+initial+" studentid="+studentid+" rollnumber="+rollnumber+" qualification="+qualification+" mobilenumber="+mobilenumber+" email="+email+" cgpa="+cgpa+" dob="+dob);
		//try(Connection connection= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926","sql6641926", "pG7bX7JQLi");
		try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "manju12345");) 
		{
			  String insert_query = "INSERT INTO `schooldb`.`student` (`student_id`, `name`, `initial`, `roll_no`, `degree`, `year`, `mobile_no`, `dob`, `cgpa`, `email`) VALUES (?,?,?,?,?,?,?,?,?,?)";
			  		
	            try (PreparedStatement preparedStatement = connection.prepareStatement(insert_query)) {
	            	
	            	preparedStatement.setString(1, studentid);
	                preparedStatement.setString(2, name);
	                preparedStatement.setString(3, initial);
	                preparedStatement.setString(4, rollnumber);
	                preparedStatement.setString(5, qualification);
	                preparedStatement.setString(6, year);
	             	preparedStatement.setString(7, mobilenumber);
	             	preparedStatement.setString(8, dob);
	                preparedStatement.setString(9, cgpa);
	                preparedStatement.setString(10, email);       
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
		dispatcher = req.getRequestDispatcher("StudentMark.html");
		dispatcher.forward(req, resp);
	}
}

