package com.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

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
		
		
		String name = (String)request.getAttribute("name");
		System.out.println("user logged into website ="+name);
		
		ServletConfig config = getServletConfig();
		ServletContext context=config.getServletContext();
		String code = context.getInitParameter("WebSiteCode");
		System.out.println("the cotext parameter inside StudentDetailServlet code ="+code);
		
		//getConfig parameter
		String defaultPwd = config.getInitParameter("defaultPassword");
		System.out.println("config init parameter pwd= "+defaultPwd);
		
		HttpSession session=request.getSession();
		
		HashMap<String, String> userDetailsMap= (HashMap)session.getAttribute("userObject");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String outputTable = "<table border=2, align=center><tr><td>Student RollNumber</td><td>Student Name</td><td>Degree</td><td>Mobile Number</td><td>Email</td><td>DOB</td><tr>";
		
		String studId = request.getParameter("studentid");
		System.out.println("inside the doGet student id ="+studId);
		String query = "SELECT * FROM testdb.student where studentid="+userDetailsMap.get("userId");
		System.out.println("select query ="+query);
		try {
			Connection conn=DBConnection.getConnection();
			PreparedStatement stat=conn.prepareStatement(query);
			ResultSet resultSet = stat.executeQuery();
			while (resultSet.next()) {
			//	outputTable = outputTable.concat("<tr><td>"+resultSet.getString("rollno")+"</td><td>"+resultSet.getString("studentname")+"</tr>");
				outputTable = outputTable.concat("<tr><td>"+resultSet.getString("rollno")+"</td><td>"+resultSet.getString("studentname")+"</td><td>"+resultSet.getString("degree")+"</td><td>"+resultSet.getString("mobile_no")+"</td><td>"+resultSet.getString("email")+"</td><td>"+resultSet.getString("DOB")+"</tr>");

			
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outputTable = outputTable.concat("</table>");
		

		String username = userDetailsMap.get("userName");
		String userRole = userDetailsMap.get("userType");
		out.println("<br><span>UserName: "+username+"</span><br>");
		out.println("<br><span>User Role: "+userRole+"</span><br>");
		
		
		System.out.println(outputTable);
		out.println(outputTable);
		
		
		
	}



}
