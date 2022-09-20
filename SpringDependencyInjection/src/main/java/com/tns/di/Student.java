package com.tns.di;

public class Student {
	private String studentname;
	private int id;
	
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void display()
	{
		System.out.println("Student inforamation"+studentname+" "+id);
	}

}
