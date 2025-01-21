package com.basics;

public class Student implements Comparable<Student> {

    private int rollNumber;
    private String name;
    private String course;

    public Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public String toString() {
        return rollNumber + " : " + name;
    }

//    equality change:


    public boolean equals(Object object) {

        Student student1 = (Student) object;
        System.out.println(this.rollNumber + " == " + student1.rollNumber);
        return this.rollNumber == student1.rollNumber && this.name.equals(student1.name);

    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (this.rollNumber == anotherStudent.rollNumber) {
            return -this.name.compareTo(anotherStudent.name);

        }
        return this.rollNumber - anotherStudent.rollNumber;
    }
}
