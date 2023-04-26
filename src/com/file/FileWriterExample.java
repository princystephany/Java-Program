package com.file;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		String str="File Handling concept - file writer";
		try {
			FileWriter fw=new FileWriter("E:\\Test.txt");
			fw.write('J');
			fw.write('a');
			fw.write('v');
			fw.write('a');
			for(int i=0;i<str.length();i++) {
				fw.write(str.charAt(i));
			}
			System.out.println("Success");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();		}

	}

}
