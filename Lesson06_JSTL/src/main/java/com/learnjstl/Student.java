package com.learnjstl;

public class Student {
	
	int studentID;
	String name;
	String grade;
	
	public Student(int studentID, String name, String grade) {
		this.studentID = studentID;
		this.name = name;
		this.grade = grade;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

}
