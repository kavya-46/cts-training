package com.innnerClass;

class A
{
    public void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    public void show() {
        System.out.println("B");
    }

}
public class AnonymousClass2 {
    public static void main(String[] args)
    {
//anonymous class
A obj= new A()
{
    public void show()
    {
        System.out.println("in new show");
    }
};
//anonymous class
obj.show();
    }
}
