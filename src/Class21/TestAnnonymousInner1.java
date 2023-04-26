package Class21;

interface Test{  
	 void display();  
	 void show();
	} 

class A4 implements Test{

	@Override
	public void display() {
	}

	@Override
	public void show() {
	}
	
}
public class TestAnnonymousInner1 {

	public static void main(String[] args) {
		Test e=new Test(){  
			  public void display(){
				  System.out.println("nice fruits");
				  }
			  public void show() {
				  System.out.println("Annonymous class - show method");
			  }
			 };  
			 e.display();
			 e.show();

	}

}