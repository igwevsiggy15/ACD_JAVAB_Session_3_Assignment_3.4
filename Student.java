package assignment_4;

import java.util.Scanner;

public class Student {
	private String name, phoneNum;
	private int rollNum, grade;
	
	public Student(){
		this.name = "Student";
		this.phoneNum = "555-555-5656";
		this.rollNum = 1;
		this.grade = 9;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void updateStudent(String name, String num, int id, int grade){
		this.name = name;
		this.phoneNum = num;
		this.rollNum = id;
		this.grade = grade;
	}
	
	public void result(double math, double lit, double physics, int roll){
		if(math >= 70 && lit >= 70 && physics >= 70)
			System.out.println(this.name + ", grade " + this.grade + ", ID#" + this.rollNum + ", Phone: " + this.phoneNum
					+ " \nMathematics: " + math + "\nLiterature: " + lit + "\nPhysics: " + physics + "\n Status: Pass");
		else
			System.out.println(this.name + ", grade " + this.grade + ", ID#" + this.rollNum + ", Phone: " + this.phoneNum
					+ " \nMathematics: " + math + "\nLiterature: " + lit + "\nPhysics: " + physics + "\n Status: Fail");
	}
}