package DependencyInjectionConflicts;
import DependencyInjectionConflicts.ICourse;
import ch.qos.logback.core.model.processor.DependencyDefinition;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//target class
public class TShapedSkills2{
    @Autowired
    @Qualifier("Java") //you cannot be applied to the constructor
    //if qualifier and springboot both are present,then @Qualifier will be dominating the primary
    private DependencyInjectionConflicts.ICourse course; //private var course implemeting Icourse
    //constructor
    public TShapedSkills2(DependencyInjectionConflicts.ICourse course) { //spring uses this when we use <constructor-arg> in XML
        // super();
        System.out.println("bean created through constructor");
        this.course = course;
    }

    public TShapedSkills2()   //constructor- spring uses this when u call <property>
    {
        System.out.println("Tshaped skills beans created");
    }
    @Qualifier("Java") //same as @Primary but we have to give the bean id that is class name
@Autowired //please perform the di using setter
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
