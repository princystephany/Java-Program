package com.interface1;

@FunctionalInterface
interface Square{
	int Area(int x) ;
}

public class FunctionalInterfaceExample2 {
	
	public static void main(String[] args) {
		Square s=(int x)->x*x;
		System.out.println(s.Area(4));
	}

}
