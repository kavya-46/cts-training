package DependencyInjectionConflicts;

import org.springframework.stereotype.Service;

@Service
public class SpringBoot2 implements ICourse{
    public SpringBoot2()

    {
        System.out.println("SpringBoot Bean created");
    }
    public Boolean getTheCourse(Double price)
    {
        System.out.println("SpringBoot course is purchased successfully and fees paid is");
        return true;
    }
}
