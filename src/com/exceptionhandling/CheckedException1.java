package com.exceptionhandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException1 {

	public static void main(String[] args) {
		File file=new File("file:///E:/SSC/GA-GS-Capsule%202020.pdf");
			FileInputStream stream;
			try {
				stream = new FileInputStream(file);
				System.out.println(stream);
			} catch (FileNotFoundException e) {
				System.out.println("File not found Exception");
			}//Checked Exception
			


	}

}