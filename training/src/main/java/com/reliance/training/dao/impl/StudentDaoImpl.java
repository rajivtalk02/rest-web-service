package com.reliance.training.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reliance.training.dao.IStudent;
import com.reliance.training.model.Course;
import com.reliance.training.model.Student;

@Component
public class StudentDaoImpl implements IStudent {

	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Course> courseList = new ArrayList<Course>();

	// hard coded student list
	static {

		courseList.add(new Course("IT", "Permanent"));
		courseList.add(new Course("Mechanical", "Correspondence"));
		studentList.add(new Student("1", "Rohit", "1234", courseList));
		studentList.add(new Student("2", "Virat", "5555", null));

	}

	public List<Student> getStudent() {
		return studentList;
	}

	// Create a URL to get Student Courselist he is reading

	public List<Course> getStudentCourse(String studentName) {
		List<Course> studentCourseFound = new ArrayList<>();
		for (Student student : studentList)
			if (student.getName().equalsIgnoreCase(studentName)) {
				studentCourseFound.addAll(student.getStudentCourse());
			}
		return studentCourseFound;
	}

	// Create a URL to remove a book from user list

	public void removeStudentCourse(String studentName) {
		List<Course> studentCourseFound = new ArrayList<>();
		for (Student student : studentList)
			if (student.getName().equalsIgnoreCase(studentName)) {
				studentCourseFound.addAll(student.getStudentCourse());
			}

		courseList.removeAll(studentCourseFound);
	}

	// Create a URL to update book name

	public void updateCourse(String course) {

	}

}
