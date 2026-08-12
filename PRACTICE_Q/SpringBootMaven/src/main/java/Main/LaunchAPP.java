package Main;
import LooseCoupling.TShapedSkills;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//here object is called spring BEAN
//using IOC(inversion of control)
public class LaunchAPP
{
    public static void main(String[] args)
    {
//ApplciationContext
        //BeanFactory

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

        TShapedSkills t = container.getBean(TShapedSkills.class);
        Boolean status = t.buyTheCourse(3999.0);
        if(status)
            System.out.println("course purchased");
        else
            System.out.println("faile1d");

    }
}
