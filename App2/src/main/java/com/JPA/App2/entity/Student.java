package com.JPA.App2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue
    private int rollNumber;
    private String name;
    private String address;
    private String standard;
//    @OneToOne(mappedBy = "student")
//    private Marks marks;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "TotalSchool")
//    private School school;
    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "School_ID")
    private School school;

    public Student() {
    }

    public Student(int rollNumber, String name, String address, String standard, School school) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.standard = standard;
        this.school = school;
    }
//    public Student(int rollNumber, String name, String address, String standard, Marks marks) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.address = address;
//        this.standard = standard;
//        this.marks = marks;
//    }
//    public Student(int rollNumber, String name, String address, String standard, School school) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.address = address;
//        this.standard = standard;
//        this.school = school;
//    }

    public Student(int rollNumber, String name, String address, String standard) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.standard = standard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

//    public School getSchool() {
//        return school;
//    }
//
//    public void setSchool(School school) {
//        this.school = school;
//    }

//    public Marks getMarks() {
//        return marks;
//    }
//
//    public void setMarks(Marks marks) {
//        this.marks = marks;
//    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
