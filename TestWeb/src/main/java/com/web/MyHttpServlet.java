package com.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.web.jdbc.LoginDataAccessObject;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet( urlPatterns =  "/MyHttpServlet",
			initParams = @WebInitParam(
					name = "defaultPassword",
					value = "admin"
					)
		)
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	int userCount = 0;
	ServletConfig config=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
    	System.out.println("inside the constructor");
    }

    
    
//    public void init() throws ServletException {
//    	System.out.println("inside the init method");
//    	this.config = getServletConfig();
//    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside the init method  with servlet config "+config.getServletName());
		this.config = config;
		
	}
	

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginDataAccessObject logindbObj=new LoginDataAccessObject();
		userCount++;
		
		//getContextParameter
		ServletContext context=config.getServletContext();
		String code = context.getInitParameter("WebSiteCode");
		System.out.println("the cotext parameter code ="+code);
		
		context.setAttribute("FirstCustomer", "Guru");
		
		//get configParameter
		String defaultPwd = config.getInitParameter("defaultPassword");
		System.out.println("config init parameter pwd= "+defaultPwd);
		
		// name = manju
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("inside the doPost method");
		PrintWriter write = response.getWriter();
		response.setContentType("text/html");

		//boolean isLoginValid = logindbObj.checkLogin(username, password);
		HashMap<String,String> details=logindbObj.getLoginDeatils(username, password);
		// sendRedirect
		if(!details.isEmpty()) { // jdbc data base check
			System.out.println("valid username and password");
			RequestDispatcher dispatcher = null;
			
			if(details.get("userType").equalsIgnoreCase("student")) {
				dispatcher = request.getRequestDispatcher("Student.jsp");
				
				Cookie cookieObj=new Cookie("TestWeb", details.get("userName") );
				cookieObj.setMaxAge(120);
				response.addCookie(cookieObj);
				
				request.setAttribute("abc", details.get("userName"));
				
				System.out.println("This is student login");
			}else {
				dispatcher = request.getRequestDispatcher("admission.html");
				response.sendRedirect("www.google.com");
				System.out.println("This is Staf login");

			}
			//dispatcher = request.getRequestDispatcher("admission.html");
			dispatcher.forward(request, response);
			
		} else {
			System.out.println("invalid username password");
			response.sendRedirect("Login.html");
		}

	}

}

