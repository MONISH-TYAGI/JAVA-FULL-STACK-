package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CustomExample {
    public static void main(String[] args) {

//       create collection
        List<Student> list=new ArrayList<>();

//        creating student objects

        Student s1=new Student(1001,"John","Java");
        Student s2=new Student(1002,"Harsh","CPP");
        Student s3=new Student(1003,"Petter","Python");
        Student s4=new Student(1004,"Michel","Web");
        Student s5=new Student(1005,"Ronny","Django");
//        System.out.println(s1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(new Student(1001,"Anshu","Spring Boot"));
        System.out.println(list);

//        pahli dikkat
//        dikkat number-1
//
        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(70);
        ages.add(30);
        ages.add(15);
        System.out.println(ages);
//        System.out.println(ages.contains(120));
//        Student tempStudent=new Student("1001","John","Spring Boot");
//
//        System.out.println(list.contains(tempStudent));

        TreeSet<Integer> treeSet=new TreeSet<>(ages);

        System.out.println(treeSet);

        TreeSet<Student> studentTreeSet=new TreeSet<>(list);

        System.out.println(studentTreeSet);







    }
}
