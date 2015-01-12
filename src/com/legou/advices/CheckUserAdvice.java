package com.legou.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CheckUserAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		String username = (String)arg1[0];
		System.out.println("Before:正在对"+username+"进行检测。。。");
	}

}
