package com.java.courses.university;

public class Student {

    private String lastname;
    private String firstname;
    private int age;

    public Student(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }

    public Student(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = 0;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }
}
