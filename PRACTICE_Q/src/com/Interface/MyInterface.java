//package com.Interface;
//// we cannot create constructors in interfaces
////interface cannot be instantiated
//interface MyInterface {
//    public static final int y = 15;
//
//    abstract void m1(); //we donot have to write abtract keyword incase of interfaces
////by default- each and every method in interface
////}
//
//
//    interface MyInterface1 {
//        final int z = 99;
//
//        abstract void m2();
//    }
//
//    interface MyInterface2 {
//        final int v = 89;
//
//        default void m3(){ //default method - we donot override,the the default value will be printed
//        //if we override - then the one in the overriden will be printed
//         System.out.println("dsfds");
//        //static method
//    }
//
//    //static method
//    static void m4() {  //cannot print static members through obj
//        System.out.println("from static method");
//    }
//}
//    /* to implement one interface through other , we use "extends" keyword */
////interface MyInterface1 extends MyInterface {
////    public static final int a = 123;
////    public abstract void m2();
////}
//    class InterfaceDemo implements MyInterface, MyInterface1,MyInterface2 { //implementing 2 interfaces through one class
//        public static final int x = 12;
//
//        public void m1() { //hence we have to give access specifier as public
//            //or else it will be in "default".
//            System.out.println("welcome frnds");
//        }
//        public void m2() {
//            System.out.println("welcome kavya");
//        }
//        public void m3() {
//            System.out.println("welcome kavyyya");
//        }
//
//        public static void main(String[] args) {
//
//            // MyInterface id = new InterfaceDemo(); --it cannot print the method in InterfaceDemo1 bcoz,the reference var here is MyInterface which doesnot contain or know abt m2();
//            InterfaceDemo id = new InterfaceDemo();
//            //x = x+1; //the final field myInterface.x cannot be assigned
//            //by default - vars created in interfaces are final
//            id.m1();
//
//            System.out.println(id.y);
//            //  System.out.println(id.x);
//            System.out.println(x); //for static var we can directly print without creating object
//            // MyInterface1 id2 = new InterfaceDemo();
//            id.m2();
//            System.out.println(z);
//            MyInterface.m4(); //for calliing static method
//
//        }
//    }
//}
//
////object cannot be created to instantiate an interface