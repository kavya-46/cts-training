package com.collections;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<StudentData> l1 = new LinkedList<>();
     //   Student s1 = new Student("Sagar");
        l1.add(new StudentData(34));
        l1.add(new StudentData(39));

        StudentData s2 = new StudentData(25);
        l1.add(s2);  //create an obj, and pssing value to linked list

     //   ListIterator<StudentData> itr2 = l1.listIterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
        Iterator it = l1.iterator();
   while(it.hasNext()) {
       System.out.println(it.next());
   }
    }
}
class StudentData {
    int rollNo;
    StudentData(int rollNo) {
        this.rollNo=rollNo;
    }
    public String toString() {
        //return rollNo+"";
        return String.valueOf(rollNo);
    }
}


//add
//add(index,value)
//addFirst()
//addLast()
//Clear()
//get()
//getFirst()
//getLast()
//remove()
//removeFirst()
//removeLast()
//size()