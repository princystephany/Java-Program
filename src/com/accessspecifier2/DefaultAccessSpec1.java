package com.accessspecifier2;

//import com.accessspecifier1.RectangleArea;
import com.accessspecifier1.ProtectedTest;
import com.accessspecifier1.PublicTest;

public class DefaultAccessSpec1 extends ProtectedTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultAccessSpec1 obj=new DefaultAccessSpec1();
		obj.display();
		
		
		//RectangleArea rec=new RectangleArea();
//		rec.display();
//		System.out.println(rec.height);
//		System.out.println(rec.width);
		DefaultAccessSpec1 t1=new DefaultAccessSpec1();
		System.out.println(t1.a);
		t1.display();
//		
		PublicTest t2=new PublicTest();
		t2.display();
	}

}

