package com.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.web.jdbc.LoginDataAccessObject;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	int userCount = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
    	System.out.println("inside the constructor");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside the init method "+config.getServletName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		userCount++;
		//name = manju
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("inside the doGet method");
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<h2>Welcome "+username+" Password= "+password+" to HttpServlets doget You are visitor Number: "+userCount+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginDataAccessObject logindbObj=new LoginDataAccessObject();
		userCount++;
		// name = manju
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("inside the doPost method");
		PrintWriter write = response.getWriter();
		response.setContentType("text/html");

		boolean isLoginValid = logindbObj.checkLogin(username, password);
		
		// sendRedirect
		if (isLoginValid) { // jdbc data base check
			System.out.println("valid username and password");
			RequestDispatcher dispatcher = null;
			dispatcher = request.getRequestDispatcher("admission.html");
			dispatcher.forward(request, response);
			
		} else {
			System.out.println("invalid username password");
			response.sendRedirect("Login.html");
		}

	}

}

