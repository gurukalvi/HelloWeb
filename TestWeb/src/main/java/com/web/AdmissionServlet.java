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
		System.out.println(" name="+name+" initial="+initial+" studentid="+studentid+" rollnumber="+rollnumber+" qualification="+qualification+" mobilenumber="+mobilenumber+" email="+email+" cgpa="+cgpa+" dob="+dob);
		//try(Connection connection= DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6641926","sql6641926", "pG7bX7JQLi");
		try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root", "manju12345");
) {
			  String insert_query = "INSERT INTO `studentdb`.`students` (`studentid`, `name`, `initial`, `rollnumber`, `Degree`, `Phone`, `Email`, `CGPA`, `DOB`) VALUES (?,?,?,?,?,?,?,?,?)";
			  		
	            try (PreparedStatement preparedStatement = connection.prepareStatement(insert_query)) {
	                preparedStatement.setString(2, name);
	                preparedStatement.setString(3, initial);
	                preparedStatement.setString(4, rollnumber);
	                preparedStatement.setString(5, qualification);
	             	preparedStatement.setString(6, mobilenumber);
	                preparedStatement.setString(7, email);
	                preparedStatement.setString(8, cgpa);
	                preparedStatement.setString(9, dob);
	                preparedStatement.setString(1, studentid);
	                
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
		dispatcher = req.getRequestDispatcher("StudentMarks.html");
		dispatcher.forward(req, resp);
	}
}

