package com.mumu.houserent.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mumu.houserent.entity.Counter;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/world")
	@ResponseBody
	public String hello() {
		return "world";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(HttpServletRequest req, HttpServletResponse res) {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		//res.sendRedirect("login-success.html");
		HttpSession session = req.getSession();
		System.out.println(session.getId());
		Counter counter = (Counter) session.getAttribute("counter");
		if (counter == null) {
			counter = new Counter(0);
			session.setAttribute("counter", counter);
		}
		return "redirect:login-success";
/*		ModelAndView model = new ModelAndView();
		model.addObject("counter", counter);
		model.setViewName("redirect:login-success");
		return model;*/
	}
	
	@GetMapping("/login-success")
	public String loginSuccess(HttpSession session, Model model) {
		Counter counter = (Counter) session.getAttribute("counter");
		if (counter == null) {
			return "redirect:login";
		}
		model.addAttribute("counter", counter);
		return "login-success";
	}
	
	@PostMapping("/login-success")
	public String postLoginSuccess(HttpSession session, Model model, @RequestParam Integer cnt) {
		Counter counter = (Counter) session.getAttribute("counter");
		if (counter == null) {
			return "redirect:login";
		}
		counter.setCnt(cnt);
		System.out.println(((Counter) session.getAttribute("counter")).getCnt());
		model.addAttribute("counter", counter);
		return "login-success";
	}
}
