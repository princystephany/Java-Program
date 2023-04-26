package com.controls;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("Value of i:"+i);
			i++;
		}
		while(i<=10);
		
		String studentName="Ravi";
		int studentId=101;
		boolean option=false;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println(studentName);
			System.out.println(studentId);
			System.out.println("Do you want to continue:");
			option=sc.nextBoolean();
		}
		while(option);
	}
}
