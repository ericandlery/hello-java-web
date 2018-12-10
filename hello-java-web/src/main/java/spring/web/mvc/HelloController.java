package spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/spring_mvc/hello")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET,value="/spring_mvc/hello")
	public String helloWorld(ModelMap model) {
		
		System.out.println("kimi mvc");
		
		return "home.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/spring_mvc/post")
	public String heyWorld(ModelMap model,String pos) {
		System.out.println("post method");
		System.out.println("pos="+pos);
		return "home.jsp";
	}

}
