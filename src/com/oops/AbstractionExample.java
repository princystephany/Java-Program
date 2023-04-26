package com.oops;

public class AbstractionExample {

	public static void main(String[] args) {
		StudentBean s=new StudentBean();
		s.setStudentRollNumber(101);
		s.setStudentName("Harii");
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentRollNumber());
		System.out.println(s.toString());
//		System.out.println(s.studentName);//Can't access the variable directly.. Because variables are private
	}
	
	void main(int a, int b) {
		System.out.println("Hello");
	}

}
