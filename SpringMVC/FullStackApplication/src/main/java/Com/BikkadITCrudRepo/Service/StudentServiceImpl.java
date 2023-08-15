package Com.BikkadITCrudRepo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.BikkadITCrudRepo.Model.Student;
import Com.BikkadITCrudRepo.Repository.StudentRepositiry;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepositiry studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		if (save != null) {
			return true;
		} else {
			return false;
		}

	}

}
