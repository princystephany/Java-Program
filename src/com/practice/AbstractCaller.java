 package com.practice;

public class AbstractCaller extends Parent {

	
	
	public static void main(String[] args) {
	
		
		
		//Cannot create/or instentiate an object for an abstact class
	/*
		Parent pp = new Parent();
		
		pp.getLoan();
		
		pp.repay();
		
		*/
		
		//using in heritance concept by extending
		//the parent class to child class
		
	
		AbstractCaller ac= new AbstractCaller();
		
		ac.getLoan();
		
		ac.repay();
	}
	
	public void repay()
	{
		
		System.out.println("I will pay the debt");
	}
	}
	

//when abstract class is not overrided then
//the child class must acept it is abstract too
	

