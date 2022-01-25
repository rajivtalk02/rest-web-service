package com.training.student.microservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.student.microservice.model.Student;

@Component
public class StudentDao {
	private static List<Student> studentList = new ArrayList<Student>();

	// hard coded student list
	static {

		studentList.add(new Student("1", "Rohit", "1234"));
		studentList.add(new Student("2", "Virat", "5555"));

	}

	public List<Student> getStudent() {
		return studentList;
	}
}
