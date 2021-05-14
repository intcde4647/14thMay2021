package com.cts.demo.bytereadwrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo1 {
     // string.txt file will be created and the data will be stored.
	// We need not to have string.txt beforehand  
	public static void main(String[] args) throws IOException {
	
		     String str="Hello cts!!!!!"; // The data is in character representation 
		     // and if we are planning to write the data in bytes we have to convert the
		     // data into bytes 
		    byte b[]=str.getBytes(); // data is converted into bytes with the String 
		    // getBytes() method
		    // The second parameter is to make the file so that contents can be appended
		    FileOutputStream fos=new FileOutputStream("string.txt",true);
		    // We created an object of FileOutputStream and passed the name of the 
		    // file in the constructor parameter
		    fos.write(b);
		    fos.close();
		    System.out.println("We wrote the content!!!!!");

	}

}
