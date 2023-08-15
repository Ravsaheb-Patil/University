package Com.BikkadITCrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.BikkadITCrud.Repository.StudentRepository;
import Com.BikkadITCrud.model.Student;

@Service
public class StudentServiceIMPL implements StudentServiceI {

	@Autowired
	private StudentRepository repository;

	@Override
	public boolean saveStudent(Student stu) {
		Student save = repository.save(stu);
		if(save!=null) {
			return true;
		}else {
		return false;
	}
	
	
}
}