package Com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/message")
	public ModelAndView welcomemsg() {
		String msg = "Welcome To Bikkad IT";

		ModelAndView mv = new ModelAndView();

		mv.addObject("MAV", msg);

		mv.setViewName("welcome");

		return mv;
	}

	@GetMapping("/Rege")

	public ModelAndView reg() {
		String msg1 = "All Type Of  IT Courses Available";
		ModelAndView mav2 = new ModelAndView();
		mav2.addObject("MAV2", msg1);
		mav2.setViewName("Reg");

		return mav2;
	}

}
