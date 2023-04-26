package com.constructor;


class Testclass{
	boolean add(int a) {
		 return true;
	}
	int add(int a, int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	static float add(int a, int b,float c) {
		return a+b+c;
	}	
}
public class StaticBinding {
	public static void main(String args[]) {
		System.out.println("Main function");
		Testclass a=new Testclass();
		float result = Testclass.add(1, 2,5.2f);
		int result1 = a.add(1, 2, 3);
		double result2 = a.add(1.5, 5);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(a.add(5, 6));	
		main();
	}
	public static void main() {
		System.out.println("Main function2");
		
		
	}
}