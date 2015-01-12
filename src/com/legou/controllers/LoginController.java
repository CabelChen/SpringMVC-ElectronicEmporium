package com.legou.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.legou.interfaces.Login;
import com.legou.models.User;

@Controller
public class LoginController{
	@RequestMapping("login.do")
	public String userLogin(@ModelAttribute User user,Model model){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Login proxy = (Login) context.getBean("userlogin");
		proxy.userLogin("MaLin");
		User user2 = (User) context.getBean("user");
		System.out.println("USER:");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println("USER2:");
		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword());
		model.addAttribute(user);
		return "success";
	}
}
