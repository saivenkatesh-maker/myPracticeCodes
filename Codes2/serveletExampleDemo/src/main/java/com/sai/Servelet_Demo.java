package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servelet_Demo")
public class Servelet_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Servelet_Demo() {
		
	}
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("username");
		request.setAttribute("user" , uname);
		
		int num1 = Integer.parseInt( request.getParameter("num1")) ;
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int addedValue = (num1 + num2);
		request.setAttribute("add", addedValue);
		
	 RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
	 rd.forward(request , response);
		
	}

}
