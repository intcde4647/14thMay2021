package com.cts.demo.charreadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo2 {

	public static void main(String[] args) throws IOException {
		
		   FileReader fr=new FileReader("string2.txt");
		   char ch[]=new char[100];
		   while(fr.read(ch)!=-1)
		   {
			   String str=new String(ch).trim();
			   System.out.println(str);
		   }
		   fr.close();
	}

}
