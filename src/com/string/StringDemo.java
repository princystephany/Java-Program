package com.string;

public class StringDemo {
	
	String name;
	public StringDemo(String comment) {
		
		this.name=comment;
 	}
	
	public String toString() {
		
		return this.name;
	}

	public static void main(String[] args) {
		
		StringDemo sd=new StringDemo("hi");
		
		String s=new String("Princy");
		StringBuffer sb= new StringBuffer("hi");
		System.out.println(sd);
		
		System.out.println(s);
		
		System.out.println(sb.reverse());
		
		
	}

}
