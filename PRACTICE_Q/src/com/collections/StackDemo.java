package com.collections;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push("kavya_jayaram");
        s.push(8);
        s.push(9);
        s.push(4);
       System.out.println(s);
s.pop();
        System.out.println(s.peek());
        System.out.println(s.search(5));
        while(!s.isEmpty()) {

            System.out.println(s.pop());
        }
      //  System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.search(5)); //it will print -1 bcoz already the stack is empty
    }
}
