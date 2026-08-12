package com.inheritence;
//single level inheritence
public class Employee { //parent/super/base
    float salary = 340000; //inst var
}
class programmer extends Employee { //child/subclass/derived
    int bonus = 50000;
    public static void main(String[] args) {
programmer p = new programmer();
        System.out.println("Total salary:" +(p.salary+p.bonus));

    }
}