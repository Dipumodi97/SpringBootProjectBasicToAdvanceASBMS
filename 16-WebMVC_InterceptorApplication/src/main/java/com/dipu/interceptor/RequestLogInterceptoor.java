package com.dipu.interceptor;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogInterceptoor implements HandlerInterceptor {

	private static final String START_TIME = "startTime";
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler) throws Exception {

		System.out.println("preHandle() method Called ...");

		long startTime = System.currentTimeMillis();

		request.setAttribute(START_TIME, startTime);
		
		// request Authentication Logic
		String clientId = request.getParameter("clientId");
		
		if("dipu".equals(clientId)) {
			return true;
		}
		
		response.getWriter().print("Invalid Request");

		return false;
	}

	/*@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler) throws Exception {

		System.out.println("preHandle() interceptor Called ...");

		long startTime = System.currentTimeMillis();

		request.setAttribute(START_TIME, startTime);

		return true;
	}*/
	

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {

		System.out.println("postHandle() interceptor Called ...");

		long endTime = System.currentTimeMillis();

		Long startTime = (Long) request.getAttribute(START_TIME);

		long time = endTime - startTime;

		System.out.println("Total Time Taken(in MS) :: " + time);
	}
}