package ua.in.dergachovda.map;

public class Main {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        Student student1 = new Student("Ivanov", "Ivan", 19);
        Student student2 = new Student("Petrov", "Petr", 20);
        Student student3 = new Student("Zithreelberman", "Mark", 21);
        map.put(student1, Grade.A);
        map.put(student2, Grade.B);
        map.put(student3, Grade.C);
        
        System.out.println(student2 + " : " + map.get(student2));
    }

}
