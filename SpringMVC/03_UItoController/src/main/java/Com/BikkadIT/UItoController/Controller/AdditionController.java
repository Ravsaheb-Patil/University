package Com.BikkadIT.UItoController.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@GetMapping("addition/{a}")
	public ModelAndView add(@PathVariable int a) {
		int c = a + a;
		ModelAndView mav = new ModelAndView();
		mav.addObject("ADD", c);
		mav.setViewName("addition");
		return mav;
		// http://localhost:9090/addition/90
	}

//	@GetMapping("add2/{a}/and/{b}")
//	public ModelAndView twono(@PathVariable int a, @PathVariable int b) {
//		int c = a + b;
//		ModelAndView mavv = new ModelAndView();
//		mavv.addObject("ADD2", c);
//		mavv.setViewName("Addition2");
//
//		return mavv;
	@GetMapping("additionOfTwoNos/{a}/and/{b}")
	public ModelAndView addofTwoNos(@PathVariable int a, @PathVariable int b) {

		int c = a + b;

		ModelAndView mav1 = new ModelAndView();
		mav1.addObject("ADD2", c);
		mav1.setViewName("additionOfTwono");
		return mav1;

	}
// for this  url 
//	"additionOfTwoNos/{a}/{b}" == http://localhost:9090/additionOfTwoNos/50/50
// For This URL
//	"additionOfTwoNos/{a}/and/{b}" == http://localhost:9090/additionOfTwoNos/30/and/50
}
