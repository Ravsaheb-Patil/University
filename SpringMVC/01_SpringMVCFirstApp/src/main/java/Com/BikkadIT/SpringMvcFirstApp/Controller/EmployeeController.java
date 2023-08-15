package Com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/empmsg")
	public String Empmsg(Model model) {

		String msg = "I Am Sujit Patil From Bikkad IT";
		model.addAttribute("EMP", msg);

		return "Welemp";

	}

}
