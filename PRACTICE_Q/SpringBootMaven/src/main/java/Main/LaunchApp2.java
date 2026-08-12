package Main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import LooseCoupling.TShapedSkills;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class LaunchApp2 {
    public static void main(String[] args) {
//lazy intialization
       // ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
        read.loadBeanDefinitions("applicationconfig.xml");
        //read.loadBeanDefinitions("applicationconfig.xml"); - we can use multiple configuration files per container

        TShapedSkills t = container.getBean(TShapedSkills.class);
        Boolean status = t.buyTheCourse(3999.0);
        if(status)
            System.out.println("course purchased");
        else
            System.out.println("failed");

    }
    }

