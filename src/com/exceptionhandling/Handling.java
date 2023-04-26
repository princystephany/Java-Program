package com.exceptionhandling;

  import java.util.Scanner;

public class Handling {
	

	
	public static void main(String[] args) {

			Handling h =new Handling();
			
	 	h.calculate();
		
	}

	private void calculate() {
 		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Give a number");
		 int a= sc.nextInt();
		 System.out.println("Give another number");
		 int b= sc.nextInt();
		 
		try {
		System.out.println(a/b);
	}
	
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Check zero at divisor");
						calculate();
		}
	}

}
