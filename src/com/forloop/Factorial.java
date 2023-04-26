package com.forloop;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter a number:");
		
		n=sc.nextInt();
		
		int sum =1;
		
		for(int i=1; i<=n; i++) {
			
			sum *= i;
			
		}
		System.out.println("Factorial of "+n+" is:"+sum);
		
	}

}
