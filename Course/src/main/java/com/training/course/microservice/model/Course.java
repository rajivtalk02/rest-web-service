package com.training.course.microservice.model;

public class Course {

	private String courseName;
	private String courseType;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Course(String courseName, String courseType) {
		super();
		this.courseName = courseName;
		this.courseType = courseType;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseType=" + courseType + "]";
	}

}
