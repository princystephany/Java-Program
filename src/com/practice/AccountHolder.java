package com.practice;

public class AccountHolder {

	public static void main(String[] args) {
		Bank bb = new Bank();
		
	int min = bb.getMinimumBalance();
	
	System.out.println(min);
		bb.setMinimumBalance(10000);
		
		min = bb.getMinimumBalance();
		System.out.println(min);
		
		
		
		//Cannot see since Bank is private
	//	System.out.println(bb.minimumBalance);
		
	//	bb.minimumBalance = 100;
		
	//	System.out.println(bb.minimumBalance);
	}
	
	
}
