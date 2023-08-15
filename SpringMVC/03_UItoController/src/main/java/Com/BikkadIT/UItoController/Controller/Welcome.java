package Com.BikkadIT.UItoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Welcome {
	@GetMapping("/wel")
	public String welcomemsg(@RequestParam String name, Model model) {

		String msg = "HIII" + name + "Welcome To BikkadIT";
		model.addAttribute("MSG", msg);
		return "welcome";

	}

}
