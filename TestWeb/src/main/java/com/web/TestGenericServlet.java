package com.web;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class TestGenericServlet
 */
public class TestGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TestGenericServlet() {
        System.out.println("inside the constructor");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    
    @Override
	public void init() throws ServletException {
    	System.out.println("inside the init method");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("inside the service method");
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<h2>Welcome to Servlets</h1>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method");
	}

}
