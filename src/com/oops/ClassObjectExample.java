package com.oops;

class TestExample{
	int a,b;//instance or global variable
	void test() {
//		int c;//local variable
//		System.out.println(c);
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
	void setUserInfo(int c,int d) {
		a=c;
		b=d;
	}
}
public class ClassObjectExample {	
	
	public static void main(String[] args) {
		TestExample testObject=new TestExample();
		testObject.setUserInfo(10, 20);
		testObject.test();
		System.out.println(testObject.a);
		System.out.println(testObject.b);
		TestExample t2=new TestExample();
		t2.setUserInfo(5, 8);
		t2.test();
	}
}
