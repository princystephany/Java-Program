package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		int roll_Number = 0;
		String studentName = null;
		System.out.println("Enter the Student First name");
		try {
			studentName=br.readLine();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		

	}

}
