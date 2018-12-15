package com.md.common.web;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//拦截器

public class AccessInterCeptor extends HandlerInterceptorAdapter{
	/**
	 * 控制层方法执行之前执行
	 * return返回值结果代表请求是继续执行下去还是到此为止
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("==doPreHandle==");
		long time = System.currentTimeMillis();
		
		//设置方位时间
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.HOUR_OF_DAY, 8);
		long startTime = c1.getTimeInMillis();
		
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.HOUR_OF_DAY, 23);
		c2.set(Calendar.MINUTE, 0);
		long endTime = c2.getTimeInMillis();
		
		if(time>endTime||time<startTime) {
			throw new Exception("服务器维护中	请每天8：00~18：00访问	(*^_^*)");
		}
		return true;
	}

}
