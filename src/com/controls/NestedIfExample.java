package com.controls;

public class NestedIfExample {
	public static void main(String[] args) {
		int studentMark = 68;
		if (studentMark >= 40) {

				if (studentMark >= 40 && studentMark <= 60) {
					System.out.println("Pass: C grade");
	
				} 
				else if (studentMark > 60 && studentMark < 80) {
					System.out.println("Pass: B grade");
	
				} 
				else if (studentMark >= 80 && studentMark < 90) {
					System.out.println("Pass: A grade");
	
				} 
				else if (studentMark >= 90 && studentMark <= 100) {
					System.out.println("Pass: S grade");
	
				}
		} 
		else 
		{
			System.out.println("Fail");
		}

	}
	
}