package com.Serialization;

import com.TypeCasting.ObjectCloning;

import java.io.*;

public class Deserialization implements Serializable {
    String name;
    int num;

    Deserialization(String name,int num) {
        this.name = name;
        this.num = num;
    }
}
class DeserializableDemo {
    public static void main(String[] args) {
try {
    FileInputStream fin = new FileInputStream("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\FileStream.txt");
    ObjectInputStream in = new ObjectInputStream(fin);
    Employee e1 = (Employee) in.readObject();
    in.close();
    fin.close();
}catch (IOException e) {
    e.printStackTrace();
} catch(ClassNotFoundException e) {
e.printStackTrace();
}
    }
}