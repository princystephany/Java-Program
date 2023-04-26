package com.oops;

public interface VechicleInterface {

	  int FLAG=10;
	// or final static int FLAG =10;	
		void noOfTyres();
		//java 8 version - we can create default and static method

	}
	class Car1 implements VechicleInterface{
		public void Test() {
			System.out.println("Test");
		}

		@Override
		public void noOfTyres() {
			System.out.println("Four tyres");		
		}
		
	}
 