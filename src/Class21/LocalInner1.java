package Class21;

//Local Inner class
public class LocalInner1 {

	private int data=30;//instance variable  
	 void display(){ 
		 	System.out.println("High level class display method");
			  
		 	class Local{  
			   void msg(){
				   System.out.println(data);
				   }  
			  }
		 	
			  Local l=new Local();  
			  l.msg();  
	 }  
	 public static void main(String args[]){  
	  LocalInner1 obj=new LocalInner1();  
	  obj.display();  
	 }  

}
