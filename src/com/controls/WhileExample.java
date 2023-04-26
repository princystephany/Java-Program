package com.controls;

public class WhileExample {

	public static void main(String[] args) {
		int n=354;//3+4+5//12
		int r,sum=0;
		while(n>0) {
			r=n%10;//5  //4 //3
			System.out.println(r);
			n=n/10;//34 //3 //0
			sum=sum+r;//0+5 //5+4 //9+3
		}
		System.out.println("Sum of digit is:"+sum);
	}

}
