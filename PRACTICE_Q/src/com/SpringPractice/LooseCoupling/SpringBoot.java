package com.SpringPractice.LooseCoupling;
//dependent object - services are used inside target class
public class SpringBoot implements ICourse{
    @Override
    public Boolean getTheCourse(Double price)
    {
        System.out.println("Springboot course is subscribed and fees paid" +price);
        return true;
    }
}
