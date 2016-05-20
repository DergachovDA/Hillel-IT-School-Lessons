package com.java.equality;

public class Person {

    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != Person.class) {
            return false;
        }

        Person person = (Person) obj;

        if (this.lastname == null || this.firstname == null)
            return false;

        if (this.lastname.equals(person.lastname))
            if (this.firstname.equals(person.firstname))
                if (this.age == person.age)
                    return true;

        return false;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
