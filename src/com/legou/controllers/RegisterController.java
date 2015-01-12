package com.legou.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.legou.models.User;
import com.legou.services.imples.UserLogin;

@Controller
public class RegisterController {
	@Autowired
	private UserLogin userLogin;
	@RequestMapping("register.do")
	public String register(@ModelAttribute User user,Model model){
		userLogin.customerLogin(user);
		return "success";
	}
}
