package com.shape;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AreaServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		double l = Double.parseDouble(req.getParameter("length"));
		double w = Double.parseDouble(req.getParameter("width"));
		String clr = req.getParameter("color");
		String shape = req.getParameter("shape");
		
		double area = l*w;
		
		PrintWriter out = res.getWriter();
		out.println("Shape: " + shape);
		out.println("Color: " + clr);
		out.println("Area: " + area);
		
	}

}
