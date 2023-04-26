package com.basicprog;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give a number");
		
		int n =sc.nextInt();
		
		boolean flag= false;
		
		for(int i=1; i<n; i++) {
			
			if(n%i == 0) 
				
				flag=true;
			
			
			
			 
		}
		
		if(!flag)
		System.out.println("It is Not a  Prime number");
		else
			System.out.println("It is   a prime number");
		
		
//		System.out.println("Do you want to continue:" );
//		
//		String command= sc.nextLine();
//		
//		if()
//				
	}

	}
