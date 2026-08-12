package com.FileHandling;
//different methods in filehandling
import java.io.*;
public class FilesDemo2 {
    public static void main(String[] args) {
        File myObj = new File("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt");
        if(myObj.exists()) {
            System.out.println(myObj.getName());
            System.out.println(myObj.getAbsoluteFile());
            System.out.println(myObj.getAbsolutePath());
            System.out.println(myObj.length());
            System.out.println(myObj.canRead());
            System.out.println(myObj.canExecute());
            System.out.println(myObj.canWrite());

        } else {
            System.out.println("file doesnot exists");
        }
    }
}
