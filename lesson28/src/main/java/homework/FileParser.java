package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("files" + File.separator + "students.txt");
        FileWriter fileWriter = new FileWriter("files" + File.separator + "students.xml");

        List<Student> students = readStudentsFromTextFile(fileReader);

        writeStudentsToXMLFile(students, fileWriter);

    }

    private static List<Student> readStudentsFromTextFile(FileReader file) throws IOException {
        BufferedReader reader = new BufferedReader(file);
        List<Student> students = new ArrayList<>();

        String line;
        String lastname = null;
        String firstname = null;
        int age = -1;

        while ((line = reader.readLine()) != null) {
            if (line.contains("Student:")) {
                for (int i = 0; i < 3; i++) {
                    line = reader.readLine();
                    String[] words = line.split(":");
                    switch (words[0].trim()) {
                        case "Lastname":
                            lastname = words[1].trim();
                            break;
                        case "Firstname":
                            firstname = words[1].trim();
                            break;
                        case "Age":
                            age = Integer.valueOf(words[1].trim());
                            break;
                    }
                }

                Student student = new Student(lastname, firstname, age);
                students.add(student);

                System.out.println(student);
            }
        }

        reader.close();
        return  students;
    }

    private static void writeStudentsToXMLFile(List<Student> students, FileWriter file) throws IOException {
        BufferedWriter writer = new BufferedWriter(file);

        writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        writer.newLine();
        writer.write("<students>");
        writer.newLine();

        for (Student student : students) {
            writer.write("\t<student>");
            writer.newLine();
            writer.write("\t\t<lastname>" + student.getLastname() + "</lastname>");
            writer.newLine();
            writer.write("\t\t<firstname>" + student.getFirstname() + "</firstname>");
            writer.newLine();
            writer.write("\t\t<age>" + student.getAge() + "</age>");
            writer.newLine();
            writer.write("\t</student>");
            writer.newLine();
        }

        writer.write("</students>");
        writer.close();
    }



}
