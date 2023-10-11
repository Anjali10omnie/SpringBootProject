package com.Students.Api.repo;
import org.springframework.data.jpa.repository.JpaRepository;


import com.Students.Api.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
