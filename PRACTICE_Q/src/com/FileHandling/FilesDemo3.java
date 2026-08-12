package com.FileHandling;
//to write in the file
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo3 {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("C:\\Org Eclipse IDE 2025-09 R\\FileHandling\\Demo.txt")) {
            myWriter.write("kavya is good girl");
            System.out.println("successfully updated");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
