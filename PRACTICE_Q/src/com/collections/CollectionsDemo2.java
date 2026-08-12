package com.collections;

import java.util.ArrayList;
import java.util.List;

class Student {
    int rollno;
    String name,address;

    Student(int rollno,String name,String address) {
this.rollno=rollno;
this.name = name;
this.address = address;
    }
}

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();
Student s1 = new Student(1,"kavya","bbsr");
        Student s2 = new Student(2,"Jayaramayya","bbsr");

        Student s3 = new Student(3,"Bhanu","bbsr");
        Student s4 = new Student(4,"Sagaru","Khurda");

        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);

        for(Student x: li) {
            System.out.println(x.rollno+" "+x.name+" "+x.address);
        }

    }
}
