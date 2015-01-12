package com.legou.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.legou.interfaces.People;
import com.legou.modules.MyBeanPostProcessor;

public class TestDemo {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("src\\applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		((XmlBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
		System.out.println("程序已经实例化BeanFactory....");
		People people = (People)bf.getBean("America");
		System.out.println("程序已经实例化America...."); 
		people.userAxe();
	}

}
