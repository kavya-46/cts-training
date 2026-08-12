package com.over;
//overhiding- static methods
class OverHiding {  //parent class
    static void dance() {
        System.out.println("i love to dance alone");
    }
}
class OverHiding1 extends OverHiding { //child class
    static void dance() {
        System.out.println("i love to dance with u");
    }
    public static void main(String[] args) {
        OverHiding1 o = new OverHiding1();
        o.dance();
    }
}