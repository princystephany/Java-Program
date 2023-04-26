package com.constructor;

class Area{
	void display() {
		System.out.println("Area display");
	}
}
class SquareArea extends Area{
	@Override
	void display() {
	super.display();
		System.out.println("Square display");
	}
	void Test() {
		System.out.println("Test Method");
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		SquareArea s=new SquareArea();
		s.display();
		s.Test();
		Area s1=new SquareArea();//Upcasting 
		s1.display();
//		s1.Test();
//		SquareArea s3=new Area();
	}

}