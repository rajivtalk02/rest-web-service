package com.training.course.microservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.course.microservice.model.Course;

@Component
public class CourseDao {

	private static List<Course> courseList = new ArrayList<Course>();

	// hard coded student list
	static {

		courseList.add(new Course("IT", "Permanent"));
		courseList.add(new Course("Mechanical", "Correspondence"));

	}

	public List<Course> getCourse() {
		return courseList;
	}
}
