package com.solution;

public class Student {
	
	String student_No;
	String firstName;
	String lastName;
	String gender;
	String email;
	int gradeMarks;
	
	
	public Student(String student_No, String firstName, int gradeMarks) {
		super();
		this.student_No = student_No;
		this.firstName = firstName;
		this.gradeMarks = gradeMarks;
	}
	public String getStudent_No() {
		return student_No;
	}
	public void setStudent_No(String student_No) {
		this.student_No = student_No;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGradeMarks() {
		return gradeMarks;
	}
	public void setGradeMarks(int gradeMarks) {
		this.gradeMarks = gradeMarks;
	}

}
