package Com.BikkadIT.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Student {
@GetMapping("/Bikkad")
	public String Stu(Model mod) {

		String name = "BIkkad IT Is Best";
		mod.addAttribute("Stu", name);

		return "STU";
	}

}
