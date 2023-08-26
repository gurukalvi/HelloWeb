package com.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

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
		System.out.println(" name="+name+" initial="+initial);

		RequestDispatcher dispatcher = null;
		dispatcher = req.getRequestDispatcher("MySchool.html");
		dispatcher.forward(req, resp);
	}

}
