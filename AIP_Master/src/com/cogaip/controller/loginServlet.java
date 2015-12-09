package com.cogaip.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cogaip.bo.LoginBO;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String loginId = request.getParameter("loginid");
		String password = request.getParameter("password");
		
		LoginBO loginBO = new LoginBO();
		int userType = loginBO.authenticateUser(loginId, password);
		
		
		if(userType==0){
			RequestDispatcher rd = request.getRequestDispatcher("userViewServlet");
			rd.forward(request, response);
		}
		else if(userType==1){
			RequestDispatcher rd = request.getRequestDispatcher("adminViewServlet");
			rd.forward(request, response);
		}
		else if(userType== -1){
			out.print("<h4>User does not exist</h4>");
		}
		else if(userType== -2){
			out.print("Username and Password does not match");
		}
		
		
		
		
	}

}
