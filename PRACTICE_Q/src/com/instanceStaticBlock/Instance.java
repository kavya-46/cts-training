package com.instanceStaticBlock;

public class Instance {
    float x;  //instance var
//Instance() {  //by using constructor assigning value
{  //instance block
    x=90;
}
    {
        System.out.println("hello guys");
    }
//class InstanceDemo {
//    int x;
//    {
//        x=45;
//    }
//}
    public static void main(String[] args) {
        Instance i = new Instance();
        System.out.println(i.x);
    }
}
