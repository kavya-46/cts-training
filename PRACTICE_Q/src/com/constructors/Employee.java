package com.constructors;

public class Employee {
    int rollno; //instance var
    String name; //inst var
    String branch;

    public static void main(String[] args) {

Employee ep = new Employee(102,"jayaramayya");
Employee ep2 = new Employee(103,"ameer");
Employee ep3 = new Employee(101,"uday","CSE");

    }
    Employee(int x,String n) { //param constr
    rollno = x;
    name = n;
        System.out.println("Name: "+name+ " Rollno:" +rollno);
    }
    Employee(String b) {
        branch = b;
        System.out.println(branch);
    }
    Employee(int a, String n,String b) {
        branch = b;
        rollno = a;
        name = n;
        System.out.println("Name: "+name+ " Rollno:" +rollno+ " Branch " +branch);

    }
}
