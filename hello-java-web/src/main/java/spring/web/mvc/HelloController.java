package spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/spring_mvc/hello")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String helloWorld(ModelMap model) {
		
		System.out.println("kimi mvc");
		
		return null;
	}

}
