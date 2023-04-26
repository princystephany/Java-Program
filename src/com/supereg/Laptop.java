package com.supereg;

public class Laptop extends Desktop{

	public Laptop(String brand) {
		super(brand);
		System.out.println(brand);
	}
	public Laptop() {
		System.out.println("Charge");
	}
	
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Laptop l2 = new Laptop("dell");
	}
	 
}
