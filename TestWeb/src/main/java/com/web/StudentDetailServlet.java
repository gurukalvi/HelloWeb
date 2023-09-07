package com.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.jdbc.DBConnection;

/**
 * Servlet implementation class StudentDetailServlet
 */
@WebServlet("/StudentDetailServlet")
public class StudentDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String outputTable = "<table border=2 ><tr><td>Student RollNumber</td><td>Student Name</td><td>Degree</td><td>Mobile Number</td><td>Email</td><tr>";
		
		String studId = request.getParameter("studentid");
		System.out.println("inside the doGet student id ="+studId);
		String query = "SELECT * FROM testdb.student where studentid="+studId;
		System.out.println("select query ="+query);
		try {
			Connection conn=DBConnection.getConnection();
			PreparedStatement stat=conn.prepareStatement(query);
			ResultSet resultSet = stat.executeQuery();
			while (resultSet.next()) {
				outputTable = outputTable.concat("<tr><td>"+resultSet.getString("rollno")+"</td><td>"+resultSet.getString("studentname")+"</tr>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outputTable = outputTable.concat("</table>");
		System.out.println(outputTable);
		out.println(outputTable);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
