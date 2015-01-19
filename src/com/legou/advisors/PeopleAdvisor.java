//package com.legou.advisors;
//
//import java.lang.reflect.Method;
//
//import org.springframework.aop.ClassFilter;
//import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
//
//import com.legou.models.People;
//
//public class PeopleAdvisor extends StaticMethodMatcherPointcutAdvisor {
//
//	@Override
//	public boolean matches(Method method, Class<?> arg1) {
//		return "Speaking".equals(method.getName());
//	}
//
//	@Override
//	public ClassFilter getClassFilter() {
//		return new ClassFilter() {
//			
//			@Override
//			public boolean matches(Class<?> arg0) {
//				return People.class.isAssignableFrom(arg0);
//			}
//		};
//	}
//
//}
