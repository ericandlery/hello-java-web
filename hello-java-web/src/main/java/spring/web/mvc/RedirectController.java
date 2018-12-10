package spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {
	
	@RequestMapping(value="/spring_mvc/redirect")
	public String index() {
		return "redirect:redirect.jsp";
	}
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String redirect() {
		return null;
	}

}
