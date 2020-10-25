package com.itycl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itycl.po.User;
import com.itycl.service.UserService;
@Controller
@RequestMapping(method={RequestMethod.GET,RequestMethod.POST}) 
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/findAllUser")
	public String findAllUser(Model model) {
		List<User> list = userService.findAllUser();
		model.addAttribute("list", list);
		return "list.jsp";
	}
	
}
