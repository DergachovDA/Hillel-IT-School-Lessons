package ua.in.dergachovda.immutability;

import java.util.Date;

public final class Student {
    private final String name;
    private final int age;
    private final Date birthday;

    public Student(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = new Date(birthday.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return new Date(birthday.getTime());
//        return (Date) birthday.clone();
    }


}
