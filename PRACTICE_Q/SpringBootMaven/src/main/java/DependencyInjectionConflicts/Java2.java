package DependencyInjectionConflicts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Java2 implements ICourse{
    public Java2()
    {
        System.out.println("Java2 bean created");
    }
    @Override
    public Boolean getTheCourse(Double price) {
        // Write your custom logic here
        System.out.println("Java Course purchased for price: " + price);
        return true;
    }
}
