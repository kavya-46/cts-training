package LooseCoupling;

//import com.SpringPractice.LooseCoupling.ICourse;

//dependent object - services are used inside target class
public class SpringBoot implements ICourse {
    public SpringBoot() {
        System.out.println("springBoot bean created");
    }
    @Override
    public Boolean getTheCourse(Double price)
    {
        System.out.println("Springboot course is subscribed and fees paid" +price);
        return true;
    }
}
