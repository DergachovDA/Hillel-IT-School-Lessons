import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person sam = new Person("Sam", 25);
        Person mark = new Person("Mark", 35);
        Person bob = new Person("Bob", 15);

        List<Person> persons = new ArrayList<>();
        persons.add(sam);
        persons.add(mark);
        persons.add(bob);

        Collections.sort(persons);
        System.out.println("Compare by age:\t\t" + persons);

        Collections.sort(persons, new PersonNameComparator());
        System.out.println("Compare by name:\t" + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }
}
