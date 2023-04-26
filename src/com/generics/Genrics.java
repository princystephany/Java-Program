package com.generics;

import java.util.ArrayList;
import java.util.TreeSet;

public class Genrics {

	public static void main(String[] args) {
 
		
		int[] ar = new int[4];
		ar[0]=5;
		ar[1]=10;
//		ar[2]=10.5;
//		ar[3]="raja";
		
		
		
		//There is no type safety in collection
		
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	ts.add(10);
	ts.add(8);
	ts.add(15);
//	ts.add("Princy");
	System.out.println(ts);
	
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Muthu");
	al.add("Ezhil");
	al.add("Princy");
	
	Genrics g= new Genrics();
	
	g.add(al);
	
			
	
				}

	private void add(ArrayList<String> al) {
		// TODO Auto-generated method stub
		//Can only add strings here
	}

}
