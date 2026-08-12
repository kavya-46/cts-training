package com.Strings;
import java.io.*; //*- we re importing all the class inside io package.
public class BufferedReaderDemo { //predefined class
    public static void main(String[] args)
            throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number:");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Enter 2nd number:");
        int y = Integer.parseInt(br.readLine());

        System.out.println("Sum is: "+(x+y));

    }

  //  private String readLine() {
   // }
}