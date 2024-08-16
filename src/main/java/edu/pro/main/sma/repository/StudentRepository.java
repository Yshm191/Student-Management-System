package edu.pro.main.sma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pro.main.sma.model.Student;
import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByUsernameAndPassword(String username, String password);
	
	public List<Student> findAllByBatchNo(String batchNo);

}
