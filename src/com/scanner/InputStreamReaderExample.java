package com.scanner;

import java.io.*;


public class InputStreamReaderExample {
	public static void main(String[] args) throws IOException  {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		
		int roll_Number = 0;
		String studentName = null;
		float CGPA = 0;
		double feesAmount = 0;
		char grade = 0;
		boolean status = false;
		char continueStatus = 0;
		
	do {	
		System.out.println("Enter the Student First name");
		studentName=br.readLine();

		System.out.println("Enter the Student Roll number");
		roll_Number=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Student CGPA");
		CGPA=Float.parseFloat(br.readLine());
		
		System.out.println("Enter the Student fees amount");
		feesAmount=Double.parseDouble(br.readLine());
		
		System.out.println("Enter the Student Grade:");
		grade=br.readLine().toCharArray()[0]; 
		
		System.out.println("Enter the Student status:");
		status=Boolean.parseBoolean(br.readLine());
	
		System.out.println("Student Information");
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Roll number:"+roll_Number);
		System.out.println("Student CGPA:"+CGPA);
		System.out.println("Student Fees Amount:"+feesAmount);
		System.out.println("Student Grade:"+grade);
		System.out.println("Student status:"+status);
		
		System.out.println("Do you want to continue:(y/n)");
		continueStatus=br.readLine().toCharArray()[0];
		}while(continueStatus=='y');
	System.out.println("Thank you");
	}
}
