package com.SpringPractice.LooseCoupling;
//target class
public class TShapedSkills {
    private ICourse course;

    public TShapedSkills(ICourse course) {
       // super();
        this.course = course;
    }

    public TShapedSkills()   //constructor
    {

    }

    public void setCourse(ICourse course) //Course course = new Java();
    {
        this.course = course;
    }

    public boolean buyTheCourse(Double amount) //creating a new method
    {
        return course.getTheCourse(amount);
    }
}
