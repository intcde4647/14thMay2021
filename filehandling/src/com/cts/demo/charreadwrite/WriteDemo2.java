package com.cts.demo.charreadwrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("string2.txt");
		String data="Hello friends!!!!!!!";
		fw.write(data);
        fw.close();
	}

}
