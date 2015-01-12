package com.legou.advices;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CheckUserAftAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		String username = (String) arg2[0];
		System.out.println("After"+username+"登陆成功！");
	}

}
