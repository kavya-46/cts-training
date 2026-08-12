package com.FileHandling;
//introduction
import java.io.*;

public class FilesDemo {
    public static void main(String[] args) {
try {
    File myObj = new File("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt");
if(myObj.createNewFile())  {
    System.out.println("File is created");
} else {
    System.out.println("File is not created");
}
}
catch(Exception e) {
    System.out.println("An error occured");
    e.printStackTrace();
}
    }
}

/*
createNewFile()
delete()
exists()- checks if the file exists
getName()-to retrieve file name
getAbsolutePath()- it returns the exact location of file
length()-to find the size
list()-to see the files in the folder
mkdir()- to make a folder
canRead()- to check if we can read the data in file
canWrite()- to check if we can write in the file
 */