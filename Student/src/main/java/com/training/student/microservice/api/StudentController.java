package com.training.student.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.student.microservice.model.Student;
import com.training.student.microservice.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public List<Student> getStudent() {
		return studentService.getStudent();
	}
}
