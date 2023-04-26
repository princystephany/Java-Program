package Class21;
class Animal{}  
class Dog1 extends Animal{//Dog inherits Animal  
}  
public class InstanceOfExample {

	public static void main(String[] args) {
		 Dog1 d=new Dog1();  
		  Dog1 d1=null;  
		
		 System.out.println(d instanceof Animal);//true  
		 System.out.println(d instanceof Dog1);
		  System.out.println(d1 instanceof Dog1);//false  

	}

}