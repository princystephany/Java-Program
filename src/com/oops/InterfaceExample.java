package com.oops;

public class InterfaceExample {

	public static void main(String[] args) {
		VechicleInterface c=new Car1();//Upcasting
		Car1 c1=new Car1();
		c1.Test();
		c1.noOfTyres();
		c.noOfTyres();//Method calling
	
		}

}
