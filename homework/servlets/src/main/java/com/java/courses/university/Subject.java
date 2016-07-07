package com.java.courses.university;

public class Subject {
    private String name;
    private int hours;
    private Teacher teacher;

    public Subject(String name, int hours, Teacher teacher) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
