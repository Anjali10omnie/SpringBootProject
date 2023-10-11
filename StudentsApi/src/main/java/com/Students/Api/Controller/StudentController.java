package com.Students.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Students.Api.Entities.Student;
import com.Students.Api.Services.StudentServiceImpl;
import com.Students.Api.repo.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl studentService;
	
	// Get the All Student
	@GetMapping("/students")
	public List<Student>getAllStudent()
	{
		return null;
		
		
	}
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return  this.studentService.getStudentById(id);
	}
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return this.studentService.addStudent(student);
	}
	

}
