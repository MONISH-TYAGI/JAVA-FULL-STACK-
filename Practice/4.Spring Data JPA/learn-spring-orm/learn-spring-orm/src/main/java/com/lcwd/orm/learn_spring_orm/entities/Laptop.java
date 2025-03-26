package com.lcwd.orm.learn_spring_orm.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptops")
public class Laptop {


    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

   @OneToOne
   @JoinColumn(name="student_id")
   private Student student;

    public Laptop(int laptopId, String modelNumber, String brand, Student student) {
        this.laptopId = laptopId;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.student = student;
    }

    public Laptop(){

    }
    
    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelnumber() {
        return modelNumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelNumber = modelnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

   
}
