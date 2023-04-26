package com.practice.abst;

public class Lenovo  extends Dell{
	
	
	public void harddrive() {
		
		System.out.println("Updating Hardware version");
	}

	
	public static void main(String[] args) {
		
		Lenovo d =new Lenovo();
		d.manufacture();
		d.harddrive();
		 
	}
}
