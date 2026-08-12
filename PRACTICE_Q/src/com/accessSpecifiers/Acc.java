package com.accessSpecifiers;
//package package1;
//import constructors.Display;
public class Acc {
    private int x = 10;  //private var
//}
//class Bcc extends Acc {


    public static void main(String[] args) {
      Acc a = new Acc();
        System.out.println(a.x);
//        Bcc b = new Bcc();
//        System.out.println(b.x);- cannot access x as it is private var
    }
}
