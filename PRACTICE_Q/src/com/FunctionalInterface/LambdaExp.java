package com.FunctionalInterface;

public class LambdaExp {
    public static void main(String[] args) {

        Audi2 a = new Audi2();
        a.drive(90,"sjd");

        Car2 c2 = new Car2()
        {  //anonymous class
            public void drive(int sp,String m) {
                System.out.println("Driving mercedes");
            }
        };
        c2.drive(98,"suzuki");


//Lambda expression with anonymous function
        //PRINTING SINGLE LINE
       Car2 c3 =(int speed,String model) -> System.out.println("Driving mercedes by lambda"); //when there are no parameters u have to keep ()

        // Car c2 = () -> 100; //if we have only 1 line to return, then we can simply write 100 by removing {} , and write just 100
//Car2 c3 = (int s) -> System.out.println("hfjs");
        //PRINTING MULTIPLE LINES
//       Car2 c3 =() -> {System.out.println("Driving benz");
//         System.out.println("Driving benzzx");};
        c3.drive(70,"kkfk");
        if(5<6)
            System.out.println("lesser");
        else
            System.out.println("greater");
    }
}
class Audi2 implements Car2 {
    @Override
    public void drive(int s,String m) {
        System.out.println("driving audi");
    }
}
@FunctionalInterface
interface Car2 {
    void drive(int speed,String model);
}

/*
interface Car2 {
   public int getSpeed(); - when there r no parameters
}
 */


/*
every lambda exp will have-
there are 3 compoonets - arguemetn list,arrow token, fucntion body
 */