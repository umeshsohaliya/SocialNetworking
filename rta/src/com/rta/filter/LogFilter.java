package com.rta.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogFilter implements Filter{
	
	private FilterConfig config;
	public void doFilter(ServletRequest req,ServletResponse res, FilterChain chain)throws IOException,ServletException
	{
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) res;
		
		
		HttpSession session=((HttpServletRequest) request).getSession();
		String sessionname=(String)session.getAttribute("username");
		String url=request.getRequestURI().toString();
		
		String purl="/SmartBid/";
		if(url.equals(purl+("login.jsp"))||url.equals(purl+("aboutus.action"))||url.equals(purl+("contactus.action")))
		{
			String u1=request.getRequestURL().toString();
			String u2=request.getQueryString();
			
			String u=u1+u2;
			System.out.println("user string"+u);
			chain.doFilter(req, res);
		}
		else if (sessionname != null) {
			
			chain.doFilter(req, res);
		}
		else {
			
			response.sendRedirect("index.jsp");
		}
	}
	public void destroy()
	{
		
	}
	public void init(FilterConfig config)throws ServletException
	{
		
	}

}
