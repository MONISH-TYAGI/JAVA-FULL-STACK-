package com.lcwd.orm.learn_spring_orm.entities;


import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_student")
public class Student {

    @Id
    private int studentid;
    private String studentName;
    private String about;

    @OneToOne(mappedBy="student",cascade= CascadeType.ALL)
    private Laptop Laptop;

    //many address:
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList=new ArrayList<>();


    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return Laptop;
    }

    public void setLaptop(Laptop laptop) {
        Laptop = laptop;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }


}
