package com.example.demo;

import com.example.demo.couple.Animal;
import com.example.demo.couple.Cat;
import com.example.demo.couple.Person;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.couple")
public class SpringCoreConceptApp {
    public static void main(String[] args) {

//        Animal animal=new Cat();
//        Person p=new Person(animal);
//        p.playWithAnimal();
      //  SpringApplication.run(SpringCoreConceptApp.class,args);

        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptApp.class, args);
        Person personBean = context.getBean(Person.class);
        personBean.playWithAnimal();

        Animal cat=context.getBean("cat",Animal.class);
        Animal dog=context.getBean("dog",Animal.class);
        cat.play();
        dog.play();
    }
}
