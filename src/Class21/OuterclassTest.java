package Class21;

//Member Inner Class
public class OuterclassTest {

	private int data=30;  
	private static int data1=30;
	 class Inner{  
		 void msg(){System.out.println("data is "+data);}  
	 }
	 static class Inner1{  
		   void msg(){
			   System.out.println("data is "+data1);
//			   System.out.println(a);
		   }  
		  }
	 public void Test() {
		 System.out.println("Inner class");
	 }
	 public static void main(String args[]){  
		 OuterclassTest obj=new OuterclassTest();
		 OuterclassTest.Inner in=obj.new Inner(); 
		 OuterclassTest.Inner1 obj1=new OuterclassTest.Inner1();
		obj.Test();
		 
	  in.msg();  
	 }
}
