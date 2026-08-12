package LooseCoupling;

//import LooseCoupling.ICourse;

//dependent objecct
public class Java implements ICourse
{
    public Java(){ //constructor
        System.out.println("java bean created");
    }

    public Boolean getTheCourse(Double price)
    {
        System.out.println("java course is subscribed and fees paid" +price);
        return true;

    }
}
