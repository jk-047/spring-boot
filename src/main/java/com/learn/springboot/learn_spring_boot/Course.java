package com.learn.springboot.learn_spring_boot;

public class Course {

	private int id;
	private String courseName;
	private String author;

	public Course(int id, String courseName, String author) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Course [id=%s, courseName=%s, author=%s]", id, courseName, author);
	}

}
