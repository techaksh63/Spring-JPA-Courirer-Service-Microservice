package com.JPA.App2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Marks")
public class Marks {
    @Id
    @GeneratedValue
    private int registerNumber;
    private int marks;
    private String resultStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RollNo")
    private Student student;

    public Marks() {
    }
//    public Marks(int registerNumber, int marks, String resultStatus) {
//        this.registerNumber = registerNumber;
//        this.marks = marks;
//        this.resultStatus = resultStatus;
//    }

    public Marks(int registerNumber, int marks, String resultStatus, Student student) {
        this.registerNumber = registerNumber;
        this.marks = marks;
        this.resultStatus = resultStatus;
        this.student = student;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
