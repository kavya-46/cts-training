package DependencyInjectionConflicts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationExecutor {
    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(ApplicationExecutor.class, args);

        // Grab your target bean and call the buy action
        TShapedSkills2 skillApp = container.getBean(TShapedSkills2.class);
        skillApp.buyTheCourse(5000.0);
        container.close(); // Clean shutdown
    }
}