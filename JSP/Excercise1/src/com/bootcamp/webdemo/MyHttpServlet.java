package com.bootcamp.webdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter  out=resp.getWriter()){
			out.print("<h1>welcome<h1>");
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	

}
