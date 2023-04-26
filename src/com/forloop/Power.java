package com.forloop;

import java.util.Scanner;


public class Power {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		int p;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("Enter the power number:");
		p= sc.nextInt();
		
		int value=1;
		for(int i=1; i<=p; i++) {
			
			value *= n;	
		}
		System.out.println("the power value of the number is:"+value);
	}

}
