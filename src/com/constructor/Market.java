package com.constructor;

public class Market {
	
	String name;
	int price;
	int discount;

	Market( String n,int p,int d){
	
		System.out.println("Constructor");
		this.name=n;
		this.price=p;
		this.discount=d;
		
		
	}
	
	void display() {
		
		System.out.println("Name of the product:"+name);
		System.out.println("Price of the product:"+price);
		System.out.println("Discout in the product:"+discount);
	}

	public static void main(String[] args) {
		
		Market m1 = new Market("Layz",10,10);
//		m.name="Layz";
//		m.price=10;
//		m.discount=10;
		
		m1.display();
		
		Market m2 = new Market("Chocos",50,15);
		
		m2.display();

		
	}
}
