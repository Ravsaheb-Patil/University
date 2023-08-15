package Com.BikkadIT.UItoController.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentConstroller {
	@GetMapping("/Form")
	public String loadform() {// This Method Only For Display Form On Website 

		return "form";
	}
	@GetMapping("/SaveStudent")
	public ModelAndView saveStu(Student Stu) {
//		System.out.println(Stu);
		ModelAndView mav=new ModelAndView();
		mav.addObject("STU", Stu.getSname());
		mav.setViewName("Students");
		
		return mav;
		
	}
	
	
	
	
}
