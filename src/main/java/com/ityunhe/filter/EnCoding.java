package com.ityunhe.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EnCoding implements Filter {
	String EnCoding=null;
	public void destroy() {
		System.out.println("字符过滤器销毁");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
			throws IOException, ServletException {
		if(request.getCharacterEncoding()==null){
			request.setCharacterEncoding(EnCoding);
		}
		if(response.getContentType()==null){
			response.setContentType("text/html; charset="+EnCoding);
		}
		fc.doFilter(request, response);
	}
	public void init(FilterConfig conf) throws ServletException {
		EnCoding=conf.getInitParameter("encoding");
		System.out.println("字符过初始化话,把字符集过滤成为"+EnCoding);
	}

}
