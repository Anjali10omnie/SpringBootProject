package com.Students.Api.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Students.Api.Entities.Student;
import com.Students.Api.repo.StudentRepository;

@Service
public class StudentServiceImpl  {
	
	@Autowired
	private StudentRepository studentrepository;
	
	

	public List<Student> getAllStudent() {
		
		return studentrepository.findAll();
	}
	
	
	public Student getStudentById(int id) {
		
		return studentrepository.getOne(id);
	}
	 
	
	
	public Student addStudent(Student student) {
		
		studentrepository.save(student);
		return student ;
	}


	
	

}
