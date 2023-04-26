package com.practice;

import java.util.Scanner;

public class Fibonacci {
	
	
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
			
	
System.out.println("give input");

int n= sc.nextInt();
 
int sum1 =0;

int sum2 = 1;

for(int i=0; i<=n; i++) {	
	
 
	   int temp= sum1;//0 1 1 2 

     sum1= sum2;//1 1 2
     
     sum2 =temp+sum2;//1 2 3 
     
     System.out.print(temp+ " ");
 }
 }
}
