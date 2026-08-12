package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
String name;
int num;

Employee(String name,int num) {
    this.name = name;
    this.num = num;
}
}
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee("kavya",9);
       // System.out.println(e.name+" "+e.num);
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\FileStream.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout); //to access the file
            out.writeObject(e);
            out.close();
            fout.close();
        } catch(IOException o) {
            o.printStackTrace();
        }
     }
}
