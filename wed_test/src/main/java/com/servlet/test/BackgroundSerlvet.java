package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/background")
public class BackgroundSerlvet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//System.out.println("do Get...");
		
		//String color = request.getParameter("color"); 
		
		// request 데이터 가공 -> request 반영
		// request.getParameter(""); 사용자로 부터 박은 data
		
		// request.setAttribute("key", "value"); 가공된 data
		// request.getAttribute("key");
		
		request.getRequestDispatcher("/WEB-INF/views/background.jsp").forward(request, response);
		
		//response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		//out.println("<h1>do Get...</h1>");
		//out.println("<style>");
		//out.println("body { background-color:"+color+";}");
		//out.println("</style>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("do Post...");
	}

}
