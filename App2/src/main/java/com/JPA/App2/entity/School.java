package com.JPA.App2.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "School")
public class School {
    @Id
    @GeneratedValue
    private int registerNumber;
    private String name;
    private String address;
    private int totalStudent;
    private int totalTeacher;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "School_ID",referencedColumnName = "registerNumber")
    private List<Student>  student;

    public School(int registerNumber, String name, String address, int totalStudent, int totalTeacher, List<Student> student) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.address = address;
        this.totalStudent = totalStudent;
        this.totalTeacher = totalTeacher;
        this.student = student;
    }

    public School() {
    }
      public School(int registerNumber, String name, String address, int totalStudent, int totalTeacher) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.address = address;
        this.totalStudent = totalStudent;
        this.totalTeacher = totalTeacher;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
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

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public int getTotalTeacher() {
        return totalTeacher;
    }

    public void setTotalTeacher(int totalTeacher) {
        this.totalTeacher = totalTeacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
