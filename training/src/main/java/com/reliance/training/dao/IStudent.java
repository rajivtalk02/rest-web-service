package com.reliance.training.dao;

import java.util.List;

import com.reliance.training.model.Course;
import com.reliance.training.model.Student;

public interface IStudent {

	List<Student> getStudent();

	List<Course> getStudentCourse(String studentName);

	void removeStudentCourse(String studentName);

}
