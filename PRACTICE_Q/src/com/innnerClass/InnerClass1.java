package com.innnerClass;
class Outer {
    class Inner {
        void innerMethod() {
            System.out.println("inner class method");

        }
    }

    void outerMethod() { //instance method
        System.out.println("Outer class method");
        //calling from instance method
        Inner i = new Inner();
        i.innerMethod();
    }
}
public class InnerClass1 {
    public static void main(String[] args) {
Outer o = new Outer();
o.outerMethod();
//Inner i = new Inner();
//i.innerMethod();
        Outer.Inner i = new Outer().new Inner(); //creating refe var and obj for innner class
        i.innerMethod();
    }
}

//calling from instance method
//calling from static method