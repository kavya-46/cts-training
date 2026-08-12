package com.FileHandling;
//file INPUT STREAM
import java.io.*;
public class FilesDemo6Stream {
    public static void main(String[] args) {
        try {
           FileInputStream fis = new FileInputStream("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt");
           int i = 0;
           while((i=fis.read())!=-1) {
               System.out.print((char)i);
           }
//SequenceInputStream - TO READ THE CONTENT OF 2 FILES
// ByteArrayOutputStream- to store same data in multiple files at a time
//canRead - to read a file or not - true
            //canWrite- we can add data or not- true/false
            //setReadable(false)- cannot read the content
            //setWritable(false)-  cannot write in the file

//           int i = fis.read();
//            System.out.println((char)i);
//            fis.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
