package Class21;

class Test3 {

	public final void display() {
		System.out.println("Display method");
	}
	
	public static void display1(int a) {
		System.out.println("Display method with parameter:"+a);
	}

}
public class FinalKeywordExample extends Test3{

	final static int FLAG=1;
	
	final static String ADD="Add";
	public static void main(String[] args) {
		System.out.println("Final variable:"+FLAG);
		String test="Add";//Frontend
		if(test.equals(ADD)) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
//		FLAG=2;
		
	}
//	@Override	
//	public void display() {
//	 System.out.println("Display method"); 
//	 }
	 

}