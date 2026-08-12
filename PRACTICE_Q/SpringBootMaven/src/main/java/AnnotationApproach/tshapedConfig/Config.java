package AnnotationApproach.tshapedConfig;
import AnnotationApproach.tshapedservice.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages= {"AnnotationApproach"})
@Configuration
public class Config {
    public Config() {
        System.out.println("config bean created");
    }
    @Bean
    public Password createpass()
    {
        return new Password("jafk");
    }
}
