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
@WebServlet("/TotalServlet")
public class StudentMarkServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside the StudentMarks servlet");
		String markid=req.getParameter("MarkID");
		String studentid=req.getParameter("StudentID");
		String tamil=req.getParameter("TamilMark");
		String english=req.getParameter("EnglishMark");
		String maths=req.getParameter("MathsMark");
		String science=req.getParameter("ScienceMark");
		String social=req.getParameter("SocialMark");
		String computer=req.getParameter("ComputerMark");
		String totalworkingdays=req.getParameter("TotalWorkingDays");
		String presentdays=req.getParameter("PresentDays");
	
		System.out.println(" markid="+markid+" studentid="+studentid+" tamil="+tamil+" english="+english+" maths="+maths+" science="+science+" social="+social+" computer="+computer+" totalworkingdays="+totalworkingdays+" presentdays="+presentdays);
		//try(Connection connection= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926","sql6641926", "pG7bX7JQLi");
		
		try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root", "manju12345");) 
				{
			  String insert_query = "INSERT INTO `studentdb`.`marks` (`mark_id`, `student_id`, `tamil`, `english`, `maths`, `science`, `social`, `computer`, `total_working_days`, `present_days`)VALUES (?,?,?,?,?,?,?,?,?,?)";
			  		
	            try (PreparedStatement preparedStatement = connection.prepareStatement(insert_query)) {
	            	preparedStatement.setString(1, markid); 
	            	preparedStatement.setString(3, studentid);
	            	preparedStatement.setString(4, tamil);
	            	preparedStatement.setString(5, english);
	            	preparedStatement.setString(6, maths);
	                preparedStatement.setString(7, science);
	                preparedStatement.setString(8, social);
	                preparedStatement.setString(9, computer);
	                preparedStatement.setString(12, totalworkingdays);
	             	preparedStatement.setString(13, presentdays);
	               	              	      
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


