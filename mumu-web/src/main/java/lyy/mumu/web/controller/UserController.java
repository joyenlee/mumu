package lyy.mumu.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "login success";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST, produces="text/html;charset=UTF-8")
	@ResponseBody
	public String register(String name, String password, String confirmPassword) {
		LOGGER.info("用户注册参数：用户名={}，密码={}，确认密码={}", name, password, confirmPassword);
		return "注册成功";
	}
}
