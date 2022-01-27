package com.reliance.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.training.dao.impl.StudentDaoImpl;
import com.reliance.training.model.Course;
import com.reliance.training.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDaoImpl studentDao;

	public List<Student> getStudent() {

		return this.studentDao.getStudent();
	}

	public List<Course> getStudentCourse(String studentName) {
		return this.studentDao.getStudentCourse(studentName);
	}

	public void removeStudentCourse(String studentName) {
		this.studentDao.removeStudentCourse(studentName);
	}

	public void updateCourse(String courseName) {

	}
}
