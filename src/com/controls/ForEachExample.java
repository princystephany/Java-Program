package com.controls;

public class ForEachExample {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};//Array Declaration with initialization
		int[] a1=new int[10];//Array Declaration
  		System.out.println(a[3]);
		a[3]=80;
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+10;
		}
		a1[0]=10;
		a1[1]=20;
		for(int i:a) {//Enhanced Loop
			System.out.println("Array values are:"+i);
		}
		for(int i=0;i<a.length;i++) {//LEgacy Loop
			System.out.println(a[i]);
		}
		System.out.println(a1[0]);
		
	}

}
