package com.innnerClass;
class StaticInnerClass{
    static class Inner2 {
        void innerMethod() {
            System.out.println("static inner method");
        }
    }
    public static void main(String[] args) {
Inner2 i2 = new Inner2();
i2.innerMethod();
    }
}
