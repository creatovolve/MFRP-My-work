package com.cogaip.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogaip.util.DBUtil;


/**
 * Servlet implementation class RegistrationServelet
 */
public class RegistrationServlet extends HttpServlet {
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		
		
		
		
		
	}

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName=(String) request.getAttribute("firstName");
		String lastName=(String) request.getAttribute("lastName");
		String password=(String) request.getAttribute("password");
		String age=(String) request.getAttribute("age");
		String gender=(String) request.getAttribute("gender");
		String contactNumber=(String) request.getAttribute("contactNo");
		String email=(String) request.getAttribute("email");
		String address=(String) request.getAttribute("address");
		String zip=(String) request.getAttribute("zip");
		String city=(String) request.getAttribute("city");
	
	}

}
