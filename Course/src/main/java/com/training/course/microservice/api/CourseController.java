package com.training.course.microservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.course.microservice.model.Course;
import com.training.course.microservice.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<Course> getCourse() {
		return this.courseService.getCourse();
	}
}
