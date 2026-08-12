package SpringBeanLifecycle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //@ComponetScan+ @EnableAutoConfiguration
//spring boot looks at the folder that SpringApplication1 lives in,
//which is SpringBeanLifecycle. it then automatically scans every single file that package have
public class SpringBootApplication1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringBootApplication1.class, args);
        Greeting bean = container.getBean(Greeting.class);
       // Greeting greet;
        System.out.println(bean.generateWish());
        container.close();
    }

}
