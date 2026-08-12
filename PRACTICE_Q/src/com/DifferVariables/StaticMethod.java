package com.DifferVariables;

public class StaticMethod {
    int rollno;
    String name;
    static String college ="CVRAMAN GLOBAL";

    StaticMethod(int r,String n) {
        rollno=r;
        name = n;
    }
    static void change() {  //static method
        college = "IIT_BBSR";
    }
    void display() { //instance method
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(101,"Kavya");
        StaticMethod s2 = new StaticMethod(101,"Ramayya");
        s1.display();
        s2.display();
    }
}
