package com.interface1;



interface A2{
	void display(int a);//only one abstract method
}
class B2 implements A2{
	public void display(int a) {
		System.out.println("Child display method");
	}
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		B2 a1=new B2();
		a1.display(10);
		A2 a2=new A2() {

 public void display(int a) { System.out.println("Hello Display()"); }
		 
		};
		a2.display(0);
		A2 a=(int b)->{
			System.out.println("LAmbda Expression"+b);
			System.out.println("Child display method");
			};//lambda expression
		a.display(10);

	}

}
