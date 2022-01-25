package com.reliance.training.model;

import java.util.List;

public class Student {

	private String id;
	private String name;
	private String rollNo;
	private List<Course> studentCourse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public List<Course> getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(List<Course> studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Student(String id, String name, String rollNo, List<Course> studentCourse) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", studentCourse=" + studentCourse + "]";
	}

	}
