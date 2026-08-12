package com.SpringPractice.LooseCoupling;
//dependent objecct
public class Java implements ICourse
{
    public Boolean getTheCourse(Double price)
    {
        System.out.println("java course is subscribed and fees paid" +price);
        return true;

    }
}
