package com.jatin;

public class Student {
   
	
	private int rollNumber;
    private String studentName;
	private int marks;
	
	Student(){
		
	}
	Student(int roll,String name,int markss){
		rollNumber = roll;
		studentName = name;
		marks = markss;
	}
	
	public void setrollNumber(int roll) {
		this.rollNumber = roll;
	}
	
	public int getrollNumber() {
		
		return rollNumber;
	}
	
	public void setstudentName(String name) {
		this.studentName = name;
	}
	
	public String getstudentName() {
		
		return studentName;
	}
	
	public void setmarks(int marks) {
		this.marks = marks;
	}
	
	public int getmarks() {
		
		return marks;
	}
}
