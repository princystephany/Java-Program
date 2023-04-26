package com.accessspecifier1;

public class PublicTest {
	public int a=100;
	public void display() {
		System.out.println("Public Test a:"+a);
	}
	public static void main(String[] args) {
		PublicTest t1=new PublicTest();
		t1.display();

	}

}
