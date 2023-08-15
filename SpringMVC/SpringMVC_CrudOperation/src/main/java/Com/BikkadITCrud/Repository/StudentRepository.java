package Com.BikkadITCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.BikkadITCrud.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	
}
