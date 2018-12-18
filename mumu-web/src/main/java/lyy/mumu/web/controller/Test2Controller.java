package lyy.mumu.web.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Profile(value = { "prod" })
public class Test2Controller {

	@RequestMapping("/test/prod")
	@ResponseBody
	public String test2() {
		return "hello world";
	}
}
