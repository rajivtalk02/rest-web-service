package com.training.student.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.student.microservice.dao.StudentDao;
import com.training.student.microservice.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public List<Student> getStudent() {
		return this.studentDao.getStudent();
	}
}
