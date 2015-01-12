package com.legou.test;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionfactory");
		System.out.println(sessionFactory);
	}

}
