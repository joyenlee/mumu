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

	/**
	 * 登录，可以通过手机号、用户名或者电子邮箱来登录
	 * 
	 * @return
	 */
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
	
	/**
	 * 注册，可以通过手机号、用户名或者电子邮箱来注册
	 * @return
	 */
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	/**
	 * 实名认证，通过上传身份证照片和刷脸进行比对
	 * @return
	 */
	@RequestMapping("authenticateByRealName")
	public String authenticateByRealName() {
		return "authenticateByRealName";
	}
}
