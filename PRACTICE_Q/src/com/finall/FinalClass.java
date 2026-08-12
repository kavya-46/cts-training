package com.finall;

public class FinalClass {  //for not creating child class
    void display() {
        int x=20;
        System.out.println(x);
    }
}

class FinalClass2 extends FinalClass {  //inheritence
    public static void main(String[] args) {
        FinalClass fd = new FinalClass();
        fd.display();

    }
    void display() {  //overriding
        int y=10;
        System.out.println(y);
    }
}

//variables - constant
//clas - cannot be extended
//methods - cannot override