 package com.staticeg;
 
 public class StaticExample{
	 
	 static String name;
	 int a=5;
	 
	 static
	 {
		 name="Princy";
		 System.out.println("name:"+name);
		 
	 }
	 
	 static void show(int RollNo ,String stname) {
		 System.out.println("name of the student:"+ stname);
		 System.out.println("roll number"+RollNo);
	 }
	 
	 public static void main(String[] args) {
		System.out.println("main methord");
		
		int rollNo=1;
		
		System.out.println("rollnumber before st methord call:"+rollNo);
		
        show(rollNo,name);
		StaticExample.show(2,"Stephany");
		StaticExample s=new StaticExample();
		System.out.println(s.a);
//		System.out.println(s.show(5, "Ezhil"));
		
	}
 }