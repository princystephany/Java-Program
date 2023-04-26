package com.forloop;

import java.util.Scanner;

public class ReversedDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter a number:");
		
		number= sc.nextInt();
		
		int rev=0;
		int rem=0;
		
	System.out.println("Reversed number:");
	
		while(number>0) {
			
			rem= number%10;
			rev= rev*10+rem;
			number= number/10;
			
 				
		}
		
		System.out.println(rev);
		
 		
	}

}
