package com.exceptionhandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		File file=new File("E:\\SelectDataDemo.txt");
		try {
			FileInputStream stream=new FileInputStream(file);//Checked Exception
			System.out.println(stream);
			int a=10/1;//Unchecked exception
			System.out.println(a);
			int[] arr=new int[5];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
//			arr[5]=60;
			System.out.println("End of Try");
		} catch (FileNotFoundException e) {
			System.out.println("file not found exception");		
//			e.printStackTrace();
		}  catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch(Exception e){
			System.out.println("Exception"+e.getMessage());
		}
		finally {		

			System.out.println("finally");
		}
	

	}

}
