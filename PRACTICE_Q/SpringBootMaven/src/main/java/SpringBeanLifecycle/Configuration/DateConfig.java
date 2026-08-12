package SpringBeanLifecycle.Configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class DateConfig
{
public DateConfig()
{
    System.out.println("TimeConfig bean created");
}
@Bean
public LocalTime createTimeInstance() //LocalTime is an interface
{
    LocalTime time = LocalTime.now();
    return time;
}

}
