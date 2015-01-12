package com.legou.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SpeakingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] objs, Object target)
			throws Throwable {
		System.out.println(target.getClass().getSimpleName()+" is "+method.getName()+"!");

	}

}
