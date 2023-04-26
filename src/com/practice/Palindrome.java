package com.practice;

 import java.util.Scanner;


public class Palindrome {


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n;
	int n1;
	int rem;
	int rev=0;
	
	System.out.println("Enter your number");
	
	n=sc.nextInt();
	
	n1=n;
	
	
	while(n>0) {
		
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
	
	System.out.println("the reversed number is:"+rev);
	
	if(rev==n1) {
		System.out.println("It is a palindrome");
	}
	
	else {
		
		System.out.println("It is not a palindrome");
	}
	
	
	

}
}
