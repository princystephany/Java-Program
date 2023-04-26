package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	
public static void main(String[] args) {
	
	LinkedList  ll = new LinkedList();
	//LinkedList Specific Methods ->
//	addFirst(),addLast(),
//	getFirst(),getLast(),
//	removeFirst(),removeLast()
//	pollFirst(),pollLast(),
//	offerFirst(),offerLast()
//	
	ll.add(6);
	ll.add(5);
	ll.add(1);
	
	System.out.println(ll.size());
	
	System.out.println(ll);
	
	ll.addFirst(100);
	System.out.println(ll);
	ll.addLast( 500);
	System.out.println(ll)
	;
	
	ll.removeLast();
	System.out.println(ll);
	//Poll->similar to remove,pollFirst(),pollLast()
	ll.pollFirst();
	System.out.println(ll);
	//Offer->similar to add,offerFirst(),offerLast()
	ll.offer(5000); 

	System.out.println(ll);
	
	LinkedList ll2 = (LinkedList)ll.clone();
	System.out.println("cloned"+ll2);
	
 }}
