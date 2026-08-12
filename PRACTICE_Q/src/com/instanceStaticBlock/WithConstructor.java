package com.instanceStaticBlock;

public class WithConstructor {
    static {
        System.out.println("hi");
    }
    {
        System.out.println("bye");
    }
    WithConstructor() {
        System.out.println("bubu");
    }
    WithConstructor(int x) {  //parameterised constructor
        //when we call param constructor,by default instance
        //var are printed again.
        System.out.println("parameter "+x);
    }

    public static void main(String[] args) {
        System.out.println("hi form main");
        WithConstructor w = new WithConstructor();
        //reference var should be different
        WithConstructor c = new WithConstructor(4);
    }
}
