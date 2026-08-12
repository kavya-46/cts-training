package com.FileHandling;
import java.io.*;
//FILE OUTPUT STREAM
public class FilesDemo5Stream {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\FileStream.txt");
            String s = "konduru kavya";

            byte b[] = s.getBytes();   //converting the string into byte
          //  fout.write(b);
            fout.write(20);
            fout.close();
            System.out.println("Success");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
