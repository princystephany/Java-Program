package com.scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		getStudentInfo();
	}
	
	public static void getStudentInfo() {
		int roll_Number = 0;
		String studentName = null;
		float CGPA = 0;
		double feesAmount = 0;
		char grade = 0;
		boolean status = false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Student First name");
		studentName=sc.next();
		
		System.out.println("Enter the Student Roll number");
		roll_Number=sc.nextInt();
		
		System.out.println("Enter the Student CGPA");
		CGPA=sc.nextFloat();
		
		System.out.println("Enter the Student fees amount");
		feesAmount=sc.nextDouble();
		
		System.out.println("Enter the Student Grade:");
		grade=sc.next().toCharArray()[0];
		
		System.out.println("Enter the Student status:");
		status=sc.nextBoolean();
		
		
		System.out.println("Student Information");
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Roll number:"+roll_Number);
		System.out.println("Student CGPA:"+CGPA);
		System.out.println("Student Fees Amount:"+feesAmount);
		System.out.println("Student Grade:"+grade);
		System.out.println("Student status:"+status);
	}
}
 