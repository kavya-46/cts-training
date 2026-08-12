package com.Strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        //for making strings mutable
        StringBuffer sb = new StringBuffer("Hello how was ur day");
        //StringBuffer - the strating letter should be capital
        StringBuilder sb2 = new StringBuilder("welcome guys");
        System.out.println(sb2);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.append(" uday")); //append method for adding
        System.out.println(sb.delete(1,3)); //for deleting from index 1 to 3
        System.out.println(sb.deleteCharAt(0)); //returns the char at that particular index
        System.out.println(sb.substring(1,3)); //string b/w these indexes
        System.out.println(sb.subSequence(1,3)); //returns same o/p but as charSequence
        System.out.println(sb.insert(6," kavya")); //for inserting in particular index
        System.out.println(sb.replace(1,3,"good")); //for replacing with a particular index
        System.out.println(sb.reverse());
    }
}
//StringBuffer - synchronised-only 1 thread at a time
//StringBuilder - non-synchronised- many threads at same time.

