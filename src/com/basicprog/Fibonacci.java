package com.basicprog;


import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in) ;
		
		System.out.println("Give a number ");
		
		int n= sc.nextInt();
		
		
		int  sum1 = 0;
		int sum2 =1;
		
		for(int i=0; i<=n; i++) {
			
			int temp = sum1;
			
			sum1= sum2;
			
			sum2= temp+sum2;
			
			System.out.print(temp+"+");
		}
	}
}
