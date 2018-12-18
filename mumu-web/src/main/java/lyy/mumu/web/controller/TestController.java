package lyy.mumu.web.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Profile(value = { "dev", "test" })
public class TestController {

	@RequestMapping("/test/dev")
	@ResponseBody
	public String test() {
		return "hello world";
	}
}
