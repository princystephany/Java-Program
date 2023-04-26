package com.forloop;



public class Matrix {
	
	
	
	public static void main(String[] args) {

		
		int a[][]= { { 1,2,3},
				      {4,5,6},
				       {7,8,9}  };
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print("  "+a[i][j]);
				if(i==j) {
					 sum1 += a[i][j];
				}
			}
		}
		System.out.println("Sum of numbers in diagonal of a matrix:"+sum1);
		
		for(int i =0; i<2; i++) {
			for(int j=1; j<3; j++) {
				
				//System.out.print("  "+a[i][j]);
				if(i!=j) {
					 sum2 += a[i][j];
 				}
			}
		}
		System.out.println("Sum of numbers in upper triangle matrix:"+sum2);
		
		for(int i =1; i<3; i++) {
			for(int j=0; j<2; j++) {
				
				//System.out.print("  "+a[i][j]);
				if(i!=j) {
					 sum3 += a[i][j];
				}
			}
		}
		System.out.println("Sum of numbers in lower triangle matrix:"+sum3);
		

	}

}
