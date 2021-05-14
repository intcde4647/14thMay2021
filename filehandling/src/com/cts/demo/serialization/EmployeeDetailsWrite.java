package com.cts.demo.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeDetailsWrite {

	public static void main(String[] args) throws IOException {

       FileOutputStream fos=new FileOutputStream("employee.ser");
       Employee employee=new Employee();
       employee.setId(1);
       employee.setName("Suresh");
       employee.setBasic(28000);
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(employee);
       oos.close();
       fos.close();
        
	}

}
