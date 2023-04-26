package com.file;

import java.io.FileOutputStream;

public class FileIOExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("E:\\Test.txt1");
			String s="Hello File input output stream";
			byte b[]=s.getBytes();
//			fout.write(75);
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}catch(Exception e) {
			
		}

	}

}