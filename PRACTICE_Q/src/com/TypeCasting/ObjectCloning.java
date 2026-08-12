package com.TypeCasting;

public class ObjectCloning implements Cloneable {

        int rollno;
        String name;

        ObjectCloning(int rollno, String name) { //constructor
            this.rollno = rollno;
            this.name = name;
        }
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    public static void main(String[] args) {
//        ObjectCloning s1 = new ObjectCloning(101,"kavya");
//        //ObjectCloning s2 = s1; //shallow cloning
//
//        ObjectCloning s2 = new ObjectCloning(s1.rollno,s1.name); //deep cloning
//        s2.name = "konduru";
//        System.out.println(s1.rollno +" "+ s1.name);
//        System.out.println(s2.rollno +" "+ s2.name);


        try {
           ObjectCloning o1 = new ObjectCloning(9,"kavya");
           ObjectCloning o2 = (ObjectCloning) o1.clone();
            System.out.println(o1.rollno+" "+o1.name);
            System.out.println(o2.rollno+" "+o2.name);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
