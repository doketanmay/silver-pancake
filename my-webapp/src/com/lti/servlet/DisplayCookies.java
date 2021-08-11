package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayCookies
 */
@WebServlet("/DisplayCookies")
public class DisplayCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		Cookie cookie = null;
	    Cookie[] cookies = null;
	    PrintWriter out = response.getWriter();

	      // Get an array of Cookies associated with this domain
	      cookies = request.getCookies();
	      response.setContentType("text/html");
	      
	      if(cookies != null) {
	    	  for (int i = 0; i < cookies.length; i++) {
	              cookie = cookies[i];
	              out.print("Username : " + cookie.getValue() + ",  ");
	              
	           }
	        } else {
	           out.println("<h2>No cookies founds</h2>");
	        }
	      }

		
	}

	

