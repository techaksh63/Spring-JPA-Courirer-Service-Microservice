package com.JPA.App2.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private int salary;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "std_tech",joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "rollNumber"))
    private Set<Student> student;

    public Teacher(int id, String name, String address, int salary, Set<Student> student) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.student = student;
    }

    public Teacher() {
    }
       public Teacher(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Student> getStudent() {
        return student;
    }

    public void setStudent(Set<Student> student) {
        this.student = student;
    }
}
