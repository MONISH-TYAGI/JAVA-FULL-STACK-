package com.example.demo;

import com.example.demo.couple.Animal;
import com.example.demo.couple.Cat;
import com.example.demo.couple.Person;
import com.example.demo.couple.Samosa;
import com.example.demo.scope.Pepsi;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.demo.couple")
public class SpringCoreConceptApp {

    @Bean(name="samosa1")
@Primary
    public Samosa getSamosa1(){
        return new Samosa("tandoori samosa");
    }

    @Bean(name="samosa3")

    public Samosa getSamosa2(){
        return new Samosa("meetha samosa");
    }


    public static void main(String[] args) {

//        Animal animal=new Cat();
//        Person p=new Person(animal);
//        p.playWithAnimal();
      //  SpringApplication.run(SpringCoreConceptApp.class,args);

        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptApp.class, args);
        Person personBean = context.getBean(Person.class);
        personBean.playWithAnimal();

//        Animal cat=context.getBean("cat",Animal.class);
//        Animal dog=context.getBean("dog",Animal.class);
//        cat.play();
//        dog.play();

        Pepsi bean= context.getBean(Pepsi.class);
        System.out.println(bean);
        Pepsi bean1= context.getBean(Pepsi.class);
        System.out.println(bean1);
        Pepsi bean2= context.getBean(Pepsi.class);
        System.out.println(bean2);
        bean.drink();
    }
}
