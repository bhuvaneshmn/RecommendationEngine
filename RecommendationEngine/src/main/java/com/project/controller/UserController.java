package com.project.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dto.UserDTO;
import com.project.model.User;
import com.project.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String getWelcomePage(HttpServletRequest req, HttpServletResponse resp) {
		return "index";
	}

	@RequestMapping("/login")
	public String getLoginPage(HttpServletRequest req, HttpServletResponse resp) {
		return "login";
	}

	@RequestMapping("/find-user")
	public ModelAndView getEmployee(HttpServletRequest req, HttpServletResponse resp, @ModelAttribute UserDTO userDTO) {
		String name = userDTO.getName();
		String password = userDTO.getPassword();

		User emp = userService.findUser(name, password);

		Map<String, Object> model = new HashMap<String, Object>();

		String view = "login";
		model.put("status", "Invalid name and password");

		if (emp != null) {
			view = "welcome";
			model.put("status", "");
			model.put("name", emp.getName());
		} else {
			view = "invalid";
		}

		return new ModelAndView(view, model);
	}

	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public ModelAndView createEmployee(HttpServletRequest req, HttpServletResponse resp,
			@ModelAttribute UserDTO userDTO) {
		userService.registerUser(userDTO);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("name", userDTO.getName());
		return new ModelAndView("welcome", model);
	}

}