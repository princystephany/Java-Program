package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	
	
	ArrayList l= new ArrayList();//upcasting
	
	l.add(10);//Integer
	l.add(11);
	l.add(5);
	l.add(1);
	l.add(10);
	l.add("Ezhil");
	l.add(true);//not boolean but Boolean not a primitive datatype they are collection of objects
	l.add(5.2f);//Float(capital)
	l.add(3,50);
	
	
System.out.println(l);

System.out.println(l.size());

System.out.println(l.contains(1));

System.out.println("on index"+l.get(5));

ArrayList l2 =new ArrayList();
System.out.println(l2);
l2.addAll(l);
System.out.println(l2);

//l2.addAll(0,l);

l2.clear();
System.out.println("hi"+l2);

System.out.println(l2.isEmpty());
System.out.println(l.indexOf(10));
System.out.println(l.lastIndexOf(10));
System.out.println(l.remove("Ezhil"));//index and object both can me mentioned in all the methods
//returns boolean value when entering an object,gives object when index is mentioned
System.out.println(l);

l2.add(6);
l2.add(2);
l2.add(5);
l2.addAll(l);
System.out.println(l2);

//l2.removeAll(l);//holds only l2
l2.retainAll(l);//holds only l
System.out.println(l2);

System.err.println(l2.set(1, "Ezhil"));//replacing
System.out.println(l2);
List l3=l.subList(3, 5);//new object instantiation
System.out.println(l3);
}
}
