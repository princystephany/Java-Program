package com.file;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader sourceStream = null;
        try 
        {
            sourceStream = new FileReader("E:\\Test.txt");
              
            // Reading sourcefile and writing content to 
            // target file character by character. 
            int temp;
            while ((temp = sourceStream.read()) != -1)
                 System.out.print((char)temp);
        }
        finally 
        {            
            // Closing stream as no longer in use 
            if (sourceStream != null)            
                sourceStream.close();         
        }

	}

}
