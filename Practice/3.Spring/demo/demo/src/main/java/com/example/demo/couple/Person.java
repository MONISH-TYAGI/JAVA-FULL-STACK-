package com.example.demo.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {


    @Autowired
    Animal animal;
    @Autowired
Student student;
    @Autowired
    Samosa samosa;


    //constructor based configuration
//
//    @Autowired
//    public Person(Animal animal,Student student)
//    {
//        System.out.println("calling constructor...autowiring");
//        this.animal=animal;
//        this.student=student;
//    }

    public Student getStudent() {
        return student;
    }

    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting student");
        this.student = student;
      }

    // public Person( @Qualifier("dog") Animal animal)
    {
        this.animal=animal;
    }
    public void playWithAnimal(){
        animal.play();
        student.detail();
        samosa.eat();
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    public void setAnimal(Animal animal) {
        System.out.println("setting animal");
        this.animal = animal;
    }
}
