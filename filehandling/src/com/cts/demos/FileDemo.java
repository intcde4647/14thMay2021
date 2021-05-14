package com.cts.demos;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file1=new File("data.txt");
		System.out.println(file1.getName());
	    System.out.println(file1.exists());
	    File file2=new File("data2.txt");
	    System.out.println(file2.getName());
	    System.out.println(file2.exists());
	    System.out.println(file2.getPath());
	    System.out.println(file2.getAbsolutePath());
	    File file3=new File("H:\\CTS");
	   // File file3=new File("H:/CTS");
	    System.out.println(file3.exists());
	    System.out.println(file3.getPath());
	    System.out.println(file3.getAbsolutePath());
	    System.out.println(file3.isDirectory());
	    System.out.println(file3.isFile());
	    System.out.println(file3.canRead());
	    System.out.println(file3.canWrite());
	
	}

}
