package com.SpringPractice.LooseCoupling;

class Alpha
{
    public void alpha()
    {

    }
}
class Beta extends Alpha  //inheritence- still tightly coupled
{
    public void beta()
    {

        Alpha a = new Alpha(); //alpha and beta are tightly coupled
        a.alpha();
    }
}

public class LaunchApp {
    public static void main(String[] args) {
        // TShapedSkills t = new TShapedSkills(); //injecting dependednt obj inside target class is caled dependency injection

        //TShapedSkills t = new TShapedSkills(new SpringBoot()); //constructor injection

        TShapedSkills t = new TShapedSkills();
        t.setCourse(new Java());
        Boolean status = t.buyTheCourse(5999.0);

//        TShapedSkills ts = new TShapedSkills();
//        ts.setCourse(new Java()); //setter injection

//        Boolean status = ts.buyTheCourse(5999.0);
//        if(status)
//            System.out.println("success");
//        else
//            System.out.println("failed to get the course");
    }
}
