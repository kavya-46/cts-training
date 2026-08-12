package LooseCoupling;
//target class
public class TShapedSkills {
    private ICourse course; //private var course implemeting Icourse
    //constructor
    public TShapedSkills(ICourse course) { //spring uses this when we use <constructor-arg> in XML
       // super();
        System.out.println("bean created through constructor");
        this.course = course;
    }

    public TShapedSkills()   //constructor- spring uses this when u call <property>
    {
        System.out.println("Tshaped skills beans created");
    }

    public void setCourse(ICourse course) //Course course = new Java(); //variable name in the settter is course
    {
        System.out.println("setter injection is called");
        this.course = course;
    }

    public boolean buyTheCourse(Double amount) //creating a new method
    {
        return course.getTheCourse(amount);
    }
}
