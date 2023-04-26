package com.forloop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in)	;
		System.out.println("Give a positive intiger");
		
		int n=sc.nextInt();
		
		for(int i=1; i<n; i++) {
			
			if(n%i==0) {
				
				System.out.println("It is not prime number:");
			}
			else {
				System.out.println("It is prime number:");
			}
		}
		
		
	}

}
