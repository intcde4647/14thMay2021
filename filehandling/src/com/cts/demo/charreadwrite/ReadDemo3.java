package com.cts.demo.charreadwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo3 {
	public static void main(String[] args) throws IOException {
		
		   FileReader fr=new FileReader("string2.txt");
		   BufferedReader b=new BufferedReader(fr);
		  String str=b.readLine();
		  System.out.println(str);
		   fr.close();
	}
}
