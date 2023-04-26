package com.accessspecifier1;

public class DefaultAccessSpec {
         int a=10;
	public static void main(String[] args) {
		RectangleArea rec=new RectangleArea();
		rec.display();
		System.out.println(rec.height);
		System.out.println(rec.width);
		DefaultAccessSpec3 obj=new DefaultAccessSpec3();
		System.out.println(obj.a);
		ProtectedTest t1=new ProtectedTest();
		t1.display();
		
		
		PublicTest t2=new PublicTest();
		t2.display();
	}
	
	void Test() {
		System.out.println("Test");
	}

}
class DefaultAccessSpec3{
	int a;
	DefaultAccessSpec3(){
		
	}
}