package com.accessspecifier1;

public class ProtectedTest {
	protected int a=100;
	protected ProtectedTest() {
		
	}
	protected void display() {
		System.out.println("Protected a:"+a);
	}
	public static void main(String[] args) {
		ProtectedTest t1=new ProtectedTest();
		t1.display();

	}

}

