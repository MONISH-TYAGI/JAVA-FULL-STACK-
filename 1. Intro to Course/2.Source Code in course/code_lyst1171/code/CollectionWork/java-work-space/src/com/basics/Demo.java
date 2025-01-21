package com.basics;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Program started");

//        create group of numbers
//        12,34,45,12,11
//        List

//        Not-Type Safe collection
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(12);
        numberList.add(34);
        numberList.add(45);
        numberList.add(12);
        numberList.add(11);

        //numberList.add("AB");

        System.out.println(numberList);

        int sum=0;
        for(int i=0;i<numberList.size();i++){
            sum=sum+((int)numberList.get(i));

        }


//           Not-Type Safe collection
        List<String> nameList = new ArrayList<>();

        nameList.add("Durgesh");
        nameList.add("Vandna");
        nameList.add("Roshni");
        nameList.add("Harsh");
        nameList.add("Anshu");

        System.out.println(nameList);

//        group of student

//      Not-Type Safe collection
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1123, "Durgesh", "BTECH"));
        studentList.add(new Student(1124, "Harsh", "BTECH"));
        studentList.add(new Student(1125, "Vandna", "BTECH"));
        studentList.add(new Student(1126, "Anshu", "BTECH"));

        System.out.println(studentList);




    }
}
