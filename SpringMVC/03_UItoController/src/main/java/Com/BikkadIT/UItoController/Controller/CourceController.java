package Com.BikkadIT.UItoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourceController {
@GetMapping("/co")
	public ModelAndView getCource(@RequestParam String cname, @RequestParam String tname) {

		String msg=cname+" New Batch Started From 15 June By "+tname;
		ModelAndView mav= new ModelAndView();
		mav.addObject("MSGG",msg);
		mav.setViewName("course");
		//
		// http://localhost:9090/co?cname=JavaDevelopment&tname=SantoshSir
		
		
		return mav;
	}

}
