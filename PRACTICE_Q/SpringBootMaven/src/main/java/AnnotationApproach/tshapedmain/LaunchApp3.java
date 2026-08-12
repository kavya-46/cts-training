package AnnotationApproach.tshapedmain;

import AnnotationApproach.tshapedConfig.Config;
import AnnotationApproach.tshapedservice.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

public class LaunchApp3 {
    public static void main(String[] args) {
        //ApplicationContext container = new ClassPathXmlApplicationContext("appconfig.xml");
//Password pass = container.getBean(Password.class);
        ApplicationContext pass = new AnnotationConfigApplicationContext(Config.class);
        //pass.aboutAlgo();
        //System.out.println(pass.getAlgo());

    }
}
