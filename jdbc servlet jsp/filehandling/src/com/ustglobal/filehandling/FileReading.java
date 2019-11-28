package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\SHK\\Desktop\\text.txt";
		FileReader reader = null;
		try {
			 reader = new FileReader(path);  //it will point to the besides first char
//			 int i1 = reader.read();   we can only one character using this
//			 char ch1 = (char)i1;    //if we are not specifying this then we are getting ascii value
//			 System.out.println(ch1);
			 
			 int i;  //when we call read method it willl point to first character
			 while((i=reader.read())!=-1) {  //checking upto the end character ie -1
				 System.out.print((char)i);   //converting asci value to char and printing
			 }
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

