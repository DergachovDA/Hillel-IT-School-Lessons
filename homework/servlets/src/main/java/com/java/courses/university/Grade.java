package com.java.courses.university;

public class Grade {
    private int grade;
    private Student student;
    private Subject subject;

    public Grade(Student student, Subject subject, int grade) {
        this.grade = grade;
        this.student = student;
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }
}
