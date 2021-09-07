package com.sai.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sai.model.Loginbean;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  RequestDispatcher rd;
  String name=request.getParameter("username");
  String pass=request.getParameter("password");
  
    Loginbean bean = new Loginbean();
    bean.setUsername(name);
    bean.setPassword(pass);
    request.setAttribute("sai",bean);
    
    if(bean.validateUser()) {
    	
    	rd=request.getRequestDispatcher("welcome.jsp");
    	rd.forward(request, response);
    }else {
    	rd= request.getRequestDispatcher("error.jsp");
    	rd.forward(request, response);
    }
	}

}
