package com.cts.demo.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDetailsRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

     FileInputStream fis=new FileInputStream("employee.ser");
     Employee employee=null;
     ObjectInputStream ois=new ObjectInputStream(fis);
     employee=(Employee) ois.readObject();
     System.out.println(employee.getId());
     System.out.println(employee.getName());
     System.out.println(employee.getBasic());
     ois.close();
     fis.close();
	}

}
