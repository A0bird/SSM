package com.ls.Filter;

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

import com.ls.vo.User;

public class loginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest)arg0;
		
		HttpServletResponse response=(HttpServletResponse)arg1;
		
		HttpSession session=request.getSession();
		
		User user=(User)session.getAttribute("user");
		

		String loginjsp=request.getContextPath()+"/login.jsp";
		
		
		StringBuffer url=request.getRequestURL();
		
		System.out.println(url.toString());
		
		if(user!=null) {
			
			chain.doFilter(request, response);
		}else if(url.toString().contains("/login.jsp")) {
			
			chain.doFilter(request, response);
		}else if(url.toString().contains("/res/")) {
			
			chain.doFilter(request, response);
		}else if(url.toString().contains("login.do")) {
			
			chain.doFilter(request, response);
		}else {
			
			response.sendRedirect(loginjsp);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
