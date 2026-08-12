package SpringBeanLifecycle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
/*
this class contains my main business logic.
 Please take control of it, create an instance of it,
 and manage it for me.
 */
public class Greeting {
@Autowired //means dependency injection
    public LocalTime time;

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public Greeting() {
        System.out.println("greeting bean created-constructor");
    }

    @PostConstruct //will be executed automatically after the bean creation
    public void run() {
        System.out.println("bean run ");
    }
    @PreDestroy //will be executed at the end
    public void destroy()
    {
        System.out.println("bean destroyed");
    }


    public String generateWish() {
      int hour = time.getHour();
      if(hour<12)
      {
          return "Good mornign";
      }
      else if(hour<16)
          return "Good afternoon";
      else if(hour<20)
          return "Good evening";
      else
          return "Goodnight";


        //since i have written String, hence i have to write a return statement, which will be executed only when i create bean object in main Springboot application,
        //we can write print statemetns, but without return it will show an error
    }
}
//    @PreDestroy //will be executed at the end
//    public void destroy()
//    {
//        System.out.println("bean destroyed");
//    }
//    }


