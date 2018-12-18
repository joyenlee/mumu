package lyy.mumu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "login success";
	}

	@RequestMapping("/register")
	@ResponseBody
	public String register() {
		return "register success";
	}
}
