package com.cts.demo.bytereadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("string.txt");
        byte b[]=new byte[100];
		
		while((fis.read(b))!=-1)
		{
			String str=new String(b).trim();
			System.out.println(str);
		}
		fis.close();
	}
     
}
