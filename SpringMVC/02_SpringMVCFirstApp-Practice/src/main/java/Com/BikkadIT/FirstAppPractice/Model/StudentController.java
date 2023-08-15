package Com.BikkadIT.FirstAppPractice.Model;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
// Here we Add Only one Object
@Controller
public class StudentController {
	@GetMapping("/getstu")
	public ModelAndView Getstu() {

		Student stu = new Student();
		stu.setSid(555);
		stu.setSname("Sujit");
		stu.setSaddress("Nashik");

		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", stu);
		mav.setViewName("Student");
		return mav;

	}
	// Controller To Ui Multiple Data We Added Using ArrayList
	@GetMapping("/Stus")
	public ModelAndView GetStudents() {
		
		Student stu1=new Student();
		stu1.setSid(1);
		stu1.setSname("raj");
		stu1.setSaddress("Pune");

		Student stu2=new Student();
		stu2.setSid(2);
		stu2.setSname("Sattu");
		stu2.setSaddress("Nanded");
		
		Student stu3=new Student();
		stu3.setSid(3);
		stu3.setSname("Tushar");
		stu3.setSaddress("Dhule");
		
		ArrayList<Student> arl=new ArrayList<>();
		
		arl.add(stu1);
		arl.add(stu2);
		arl.add(stu3);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("STUDENTS", arl);
		mav.setViewName("Students");
		return mav;
		
		
	}
	
	
	

}
