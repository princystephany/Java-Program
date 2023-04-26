package com.constructor;



class A{
	int a;//instance variable
	int b;
	public A(int a,int b) {
		System.out.println("Parameterized Constructor");
		this.a=a;
		this.b=b;
	}
	public A() {
		
	}
	void display() {
//		int c;
//		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}	
}

public class ConstructorExample {

	public static void main(String[] args) {
		A a1=new A(10,20);
		A a2=new A();
//		A a1=new A(10,30);
		a1.display();

	}
}
