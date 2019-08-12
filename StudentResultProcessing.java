package assignment_4;

import java.util.Scanner;

public class StudentResultProcessing extends Student{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.print("Student Name: ");
		String name = scan.next();
		System.out.print("Phone Number: ");
		String num = scan.next();
		System.out.print("Roll Number: ");
		int id = scan.nextInt();
		System.out.print("Grade: ");
		int grade = scan.nextInt();
		s1.updateStudent(name, num, id, grade);
		
		System.out.print("Student Name: ");
		name = scan.next();
		System.out.print("Phone Number: ");
		num = scan.next();
		System.out.print("Roll Number: ");
		id = scan.nextInt();
		System.out.print("Grade: ");
		grade = scan.nextInt();
		s2.updateStudent(name, num, id, grade);
		
		System.out.print("Student Name: ");
		name = scan.next();
		System.out.print("Phone Number: ");
		num = scan.next();
		System.out.print("Roll Number: ");
		id = scan.nextInt();
		System.out.print("Grade: ");
		grade = scan.nextInt();
		s3.updateStudent(name, num, id, grade);
		
		System.out.println(s1.getName() + "'s Math Grade: ");
		double math = scan.nextDouble();
		System.out.println(s1.getName() + "'s Literature Grade: ");
		double lit = scan.nextDouble();
		System.out.println(s1.getName() + "'s Physics Grade: ");
		double physics = scan.nextDouble();
		
		s1.result(math, lit, physics, s1.getRollNum());
		
		System.out.println(s2.getName() + "'s Math Grade: ");
		math = scan.nextDouble();
		System.out.println(s2.getName() + "'s Literature Grade: ");
		lit = scan.nextDouble();
		System.out.println(s2.getName() + "'s Physics Grade: ");
		physics = scan.nextDouble();
		
		s2.result(math, lit, physics, s2.getRollNum());
		
		System.out.println(s3.getName() + "'s Math Grade: ");
		math = scan.nextDouble();
		System.out.println(s3.getName() + "'s Literature Grade: ");
		lit = scan.nextDouble();
		System.out.println(s3.getName() + "'s Physics Grade: ");
		physics = scan.nextDouble();
		
		s2.result(math, lit, physics, s2.getRollNum());
		
		scan.close();
	}
}