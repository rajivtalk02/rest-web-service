package com.reliance.training.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.training.model.Course;
import com.reliance.training.model.Student;
import com.reliance.training.service.StudentService;

@RestController
public class StudentContorller {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public List<Student> getStudent() {
		return this.studentService.getStudent();
	}

	@GetMapping("/student/course/{studentName}")
	public List<Course> getStudentCourse(@PathVariable String studentName) {
		return this.studentService.getStudentCourse(studentName);
	}

	@DeleteMapping("/student/course/{studentName}")
	public void removeStudentCourse(@PathVariable String studentName) {
		this.studentService.removeStudentCourse(studentName);
	}

	public void updateCourse(String courseName) {

	}
}
