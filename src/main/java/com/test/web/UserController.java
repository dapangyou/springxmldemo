package com.test.web;

import com.test.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UserController {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/test")  //就是想替换掉这个@RequestMapping
	public ModelAndView getUser(){
		return new ModelAndView();
	}
}
