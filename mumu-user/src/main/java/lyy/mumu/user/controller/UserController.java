package lyy.mumu.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lyy.mumu.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello world!";
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAA");
		ModelAndView mv = new ModelAndView();
		if (userService.login()) {
			mv.setViewName("login");
		} else {
			mv.setViewName("error");
		}
		return mv;
	}
}
