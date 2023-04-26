package com.interface1;

interface A1{
	void display();
	void show();
}
interface B1{
	void display();
}
class InterfaceChild implements A1,B1{
	public void display() {
		System.out.println("Child class display method");
	}
	public void show() {
		System.out.println("Child class show method");
	}
}
public class MultipleInheritaceExample {

	public static void main(String[] args) {
		InterfaceChild c1=new InterfaceChild();
		c1.display();
		c1.show();

	}

}
