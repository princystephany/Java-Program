package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
 import java.util.Scanner;
import java.io.IOException;
public class FileDemo1 {
	
	public static void main(String[] args) {
		
		
//		File f= new File("E:\\Java Practice\\demofile1\\test.txt");
//		
//	 
//		
//		boolean testing = f.exists();
//		
//	if(testing == false) {
//		try {
//			boolean created=f.createNewFile();
//			System.out.println("file created"+created);
//		}
//		
//		catch (IOException e) {
// 			e.printStackTrace();
//		}
//	}
		
//		File f= new File("E:\\Java Practice\\demofile1\\test.txt");
//	
//		
//
//	f.delete();
//	
//	boolean present = f.delete();
//	
//	System.out.println(present);
		
	//	File f= new File("E:\\Java Practice");
		
      //  String[] filelist=f.list();		
     //   String[] filelist1=f.listFiles();		

//		for(int i=0; i<filelist.length; i++)
//		{
//	    System.out.println(filelist[i]);
//	}

        
    //    for(String s: filelist1) {
//        	System.out.println(s);
//        }
		try {
		
			File f=new File("E:\\Java Practice\\demofile1\\best.txt");
			FileWriter fw= new FileWriter("E:\\Java Practice\\demofile1\\best.txt");
	boolean testing = f.exists();

		if(testing == true) {
			
			System.out.println("File Available");
			
 				
				
				fw.write("The Lord is my shepard I shall not want");
				
				
//				fw.write("He makes me lay down in green pastures");
				fw.flush();
				fw.close();

			} 
		else {
			System.out.println("File not available");
		}
		
		}
			catch (IOException e) {
				
 				e.printStackTrace();
			}
			
		
//		try {
//			File f = new File("E:\\\\Java Practice\\\\demofile1\\\\best.txt");
//		
//			Scanner sc=new Scanner(f);
//			
//		while(	sc.hasNextLine()){
//			
//			String data=sc.nextLine();
//			
//			System.out.println(data);
//			
//		}
//		}
//			
//			catch(FileNotFoundException e) {
//				System.out.println("error");
//				e.printStackTrace();
//			}
//			
//			
//		}	
		
	}}
