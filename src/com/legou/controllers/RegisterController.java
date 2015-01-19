package com.legou.controllers;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.legou.models.User;
import com.legou.services.imples.UserLogin;

@Controller
public class RegisterController {
	@Autowired
	private UserLogin userLogin;
	@RequestMapping("register.do")
	public String register(@ModelAttribute @Valid User user,BindingResult result){
		if (result.hasErrors()||user == null) {
			List resultList = result.getAllErrors();
			for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
				ObjectError object = (ObjectError) iterator.next();
				System.out.println(object.getDefaultMessage());
			}
			return "error";
		}
		userLogin.customerLogin(user);
		return "success";
	}
}
