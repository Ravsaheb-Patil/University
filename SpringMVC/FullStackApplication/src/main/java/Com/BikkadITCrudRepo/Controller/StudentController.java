package Com.BikkadITCrudRepo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import Com.BikkadITCrudRepo.Model.Student;
import Com.BikkadITCrudRepo.Service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;

	@GetMapping("/loadForm")
	public String loadForm() {

		return "welcome1";

	}
	@GetMapping("/saveStudent")
	public ModelAndView saveStudent(Student stu) {

		boolean saveStudent = studentServiceI.saveStudent(stu);

		if (saveStudent) {
			ModelAndView mav = new ModelAndView();
			String msg = "Student saved Successfully";
			mav.addObject("SUCCMSG", msg);
			mav.setViewName("SaveSucc");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView();
			String msg = "Student not  saved Successfully";
			mav.addObject("FAILMSG", msg);
			mav.setViewName("SaveFail");
			return mav;
		}

	}

	
}
