package spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.web.mvc.bean.GolfBean;

@Controller
public class GolfController {
	
	@RequestMapping(value="/spring_mvc/calcYard",method=RequestMethod.GET)
	public String calcYards(ModelMap model,GolfBean gb) {
		System.out.println(this.getClass().getSimpleName());
		System.out.println(gb);
		Long yards=1L;
		try {
			yards=Math.round(gb.getPower()*23);
			model.addAttribute("yards",yards);
		}catch(NullPointerException e) {
			model.addAttribute("yards",null);
		}
		
		return "golf.jsp";
	}
	
	@RequestMapping(value="/spring_mvc/golf",method=RequestMethod.GET)
	public ModelAndView golf() {
		System.out.println("mav");
		GolfBean gb=new GolfBean();
//		gb.setName("Clara");
		return new ModelAndView("golf.jsp", "golfBean", gb);
	}

}
