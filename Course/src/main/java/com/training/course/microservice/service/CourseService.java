package com.training.course.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.course.microservice.dao.CourseDao;
import com.training.course.microservice.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;

	public List<Course> getCourse() {
		return courseDao.getCourse();
	}
}
