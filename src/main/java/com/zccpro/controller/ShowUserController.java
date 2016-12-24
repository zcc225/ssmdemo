package com.zccpro.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zccpro.domain.User;
import com.zccpro.service.UserService;

@Controller
@RequestMapping("/user")
public class ShowUserController {
	@Resource
	private UserService userService;
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String s = request.getParameter("id");
		int id = Integer.parseInt(s);
		User user = userService.selectUser(id);
		model.addAttribute("user", user);
		return "ShowUser";
	}
}
