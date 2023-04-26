package com.array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

 //Sorting for non primitive datatype
		
		int[] arr = { 5,1,10,18,92};
		
		for(int i : arr)
			System.out.println(i);
		
		Arrays.sort(arr);
		
		System.out.println(" After Sorting;");
		
		
		for(int i : arr)
			System.out.println(i);
		
		
		String[] names= {"Princy","Jehremiah","yordan"};
		
		System.out.println("Before sorting:");
		
		for(String i :names)
			System.out.println(names);
		

		Arrays.sort(names);

		System.out.println("After sorting:");

		
		for(String i :names)
			System.out.println(names);
		
	}

}
