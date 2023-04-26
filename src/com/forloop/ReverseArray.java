package com.forloop;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		int[] a = {20,40,10,30,70,60};
		
		int[] b = new int[6];
		      
 		for(int i=a.length-1; i<a.length; i--) {
		
		System.out.println(a[i]);	
		
 Arrays.sort(a);
 		for(int i:a) {
 			System.out.println(i);
	}
		
//	for(int i : a) {
//		
//		if(i>sum)
//		
//			
//	}

}
}