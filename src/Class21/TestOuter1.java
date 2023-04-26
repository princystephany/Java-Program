package Class21;

//Static nested class
public class TestOuter1 {
	int a=10;
	 static int data=30;  
	  static class Inner{  
	   void msg(){
		   System.out.println("data is "+data);
//		   System.out.println(a);
	   }  
	  }  
	  public static void main(String args[]){  
	  TestOuter1.Inner obj=new TestOuter1.Inner();  
	  obj.msg();  
	  }  
}
