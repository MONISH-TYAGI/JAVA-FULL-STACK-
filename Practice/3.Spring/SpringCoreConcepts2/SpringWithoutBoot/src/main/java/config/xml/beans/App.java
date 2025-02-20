package config.xml.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("XML started");

        ApplicationContext context=new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
        Student student1= context.getBean("student1",Student.class);
        student1.sayHello();
    }
}
