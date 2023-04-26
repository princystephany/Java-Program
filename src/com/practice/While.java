package com.practice;

public class While {
	
/*public static void main(String[] args) {
	
	int num=234578;
	
	int sum = 0;
	int r;
	
	while(num>0) {
		
	r=num%10;
	
	sum=sum+r;
	
	num=num/10;
	
	}
	System.out.println("sum:"+sum);
}
}*/
	
	//public class ForEach {
		
	
		public static void main(String[] args) {
			
			int[] a  = {10,20,30,40,50};
			int[] a1= new int[10];
			
			a1[5]=9;
			System.out.println("changed number"+a1[5]);
			
			for(int i:a)
			{
				System.out.println("enhanced loop:"+i);
			}
			
			for(int i=0;i<a.length;i++)
				System.out.println("Legacy loop:"+a[i]);
		}
 	}
