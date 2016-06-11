package classwork;

public class Person implements Comparable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String out = this.name + " " + this.age;
        return out;
    }

    @Override
    public int compareTo(Object o) {

        Person p = (Person) o;

//        return Integer.compare(this.age, p.age);

        if (this.age > p.age)
            return 1;

        if (this.age < p.age)
            return -1;

        return 0;

    }

//    public int compareTo(Object o) {
//        classwork.Person p = (classwork.Person) o;
//        return this.name.compareTo(p.name);
//    }
}
