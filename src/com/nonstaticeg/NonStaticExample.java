package com.nonstaticeg;

public class NonStaticExample {
	
	static int a=10;
	int b=10;
	{
		++a;
		++b;
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("Non static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		int rollNO=101;
		String studentName="Ravi";
		NonStaticExample s=new NonStaticExample();
//		new NonStaticExample().display(rollNO, studentName);
		s.display(rollNO,studentName);
		
		NonStaticExample s1=new NonStaticExample();
		s1.display(102,"Raj");
		int total=s1.calculation(60, 75);
		System.out.println("Total Marks:"+s1.calculation(60, 75));
		System.out.println(s1.calculateAverage(total));
		NonStaticExample obj=new NonStaticExample();
	}
	
	void display(int rollNO,String studentName){//function definition//
		System.out.println("Student Roll Number:"+rollNO);
		System.out.println("Student name:"+studentName);
	}
	int calculation(int studMark,int studMark1){
		int total=studMark+studMark1;
		return total;
	}
	float calculateAverage(int total) {
		int average=total/2;
		return average;
	}
	
}