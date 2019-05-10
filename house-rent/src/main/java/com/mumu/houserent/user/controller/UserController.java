package com.mumu.houserent.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mumu.houserent.entity.Counter;
import com.mumu.houserent.user.controller.dto.LoginByAccountRequest;
import com.mumu.houserent.user.controller.dto.LoginByMobileRequest;
import com.mumu.houserent.user.controller.dto.RegisterRequest;
import com.mumu.houserent.user.controller.dto.RegisterResponse;
import com.mumu.houserent.user.repository.UserRepository;
import com.mumu.houserent.user.repository.entity.UserEntity;

@Controller
@RequestMapping("/user")
public class UserController {
	
	final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/loginByMobile.action")
	@ResponseBody
	public String loginByMobile(@Valid LoginByMobileRequest req) {
		logger.info(req.toString());
		
		return "OK";
	}
	
	@PostMapping("/loginByAccount.action")
	@ResponseBody
	public String loginByAccount(@Valid LoginByAccountRequest req) {
		logger.info(req.toString());
		
		return "ERROR";
	}
	
	@PostMapping("/register.action")
	@ResponseBody
	public RegisterResponse register(@Valid RegisterRequest req) {
		logger.info(req.toString());
		
		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(req, user);
		
		user = userRepository.add(user);
		
		RegisterResponse res = new RegisterResponse();
		BeanUtils.copyProperties(user, res);
		return res;
	}

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
