package com.practice;

public class Amstrong {
	
	public static void main(String[] args) {
		
		int n=153;
		int sum =0;
 		int reminder;
		int r3=0;
		
		while(n>0) {
			
			reminder=n%10;
			
			r3=  (int) Math.pow(reminder, 3);
					
			sum = sum + r3;
			
			n=n/10;
			
		}
		
		System.out.println(sum);
		
		
		if(sum==n) 
		{
			System.out.println("It is an amstrong number");
	}
	}

}
