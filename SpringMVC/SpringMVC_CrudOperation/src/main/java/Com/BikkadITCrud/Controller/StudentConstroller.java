package Com.BikkadITCrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import Com.BikkadITCrud.Service.StudentServiceI;
import Com.BikkadITCrud.model.Student;

@Controller
public class StudentConstroller {

	@Autowired
	private StudentServiceI serviceI;
	
	@GetMapping("/loadform")
	public String loadForm() {

		return "welcome1";

	}
	@GetMapping("/SaveStudent")
	public ModelAndView saveStudent(Student stu) {
		
		boolean saveStudent = serviceI.saveStudent(null);
		
		if(saveStudent) {
			ModelAndView mav =new ModelAndView();
			String msg="Student Save Successfully";
			mav.addObject("SUCCMSG", msg);
			mav.setViewName("SaveSucc");
			return mav;
			
		}else {
			ModelAndView mav = new ModelAndView();
			String msg = "Student not  saved Successfully";
			mav.addObject("FAILMSG", msg);
			mav.setViewName("SaveFail");
			return mav;
		}
		
		
		
	}

}
