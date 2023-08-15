package Com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmoSecondWay {

	// This is Second Way Controller to UI
	
	@GetMapping("/sps")
	public String emp(Model model) {
	String msg="Sujit Patil From Nashik";
	model.addAttribute("EMSg", msg);
	
	
	return "sp";
	
}
	
}
