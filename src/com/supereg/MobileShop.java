package com.supereg;

public class MobileShop {
	
 public MobileShop() {
	 System.out.println("welcome");
 }
 
 public MobileShop(int disc) {
	this(); //calling the constructor
	 System.out.println(disc);
 }

public static void main(String[] args) {
	
	MobileShop m1= new MobileShop();
	MobileShop m2= new MobileShop(5);

}
}
