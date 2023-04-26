package com.accessspecifier2;

import com.accessspecifier1.ProtectedTest;
import com.accessspecifier1.PublicTest;
public class AccessSpecifiersTest extends ProtectedTest{

	public static void main(String[] args) {
		AccessSpecifiersTest a=new AccessSpecifiersTest();
//		PublicTest t1=new PublicTest();
//		t1.display();
//		t1.a=20;
		a.display();
		System.out.println(a.a);

	}

}