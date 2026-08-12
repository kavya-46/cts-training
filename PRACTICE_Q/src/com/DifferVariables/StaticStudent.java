package com.DifferVariables;

public class StaticStudent {
    int rollno; //instance var
    String name;
    //staticVar- var declared inside class but outside method with static var
    static String college ="CVRaman";
    StaticStudent(int r, String n) { //constructor
    rollno = r;
    name = n;
    }
    void display() {
        System.out.println(rollno+ " "+name+" "+college);
    }
    public static void main(String args[]) {
        StaticStudent s1 = new StaticStudent(101,"Kavya");
        StaticStudent s2 = new StaticStudent(102,"UdaySagar");
        s1.display();
        s2.display();
    }
}
