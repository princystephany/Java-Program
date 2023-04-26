package com.test;

import java.util.Scanner;

 

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		boolean flag = false;
		System.out.println("Give a number");
 	n=	sc.nextInt();
		
		for(int i=2; i<n; i++) {
			
 			if(n%i == 0) {
			flag= true;	 
			 
 			}
			 
			
		
		}
		if (!flag) {
			System.out.println("The number is a Prime number");  
		}
		else {
			System.out.println("It is  Not  a prime number");
		}
		 
		
	}
	
	}


