package com.FileHandling;
//to read the content in the file
import java.io.*;
import java.util.Scanner;
public class FilesDemo4 {
    public static void main(String[] args) {
        try{
            File myRead = new File("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt");
            Scanner myReader = new Scanner(myRead);
            while(myReader.hasNextLine())  {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
