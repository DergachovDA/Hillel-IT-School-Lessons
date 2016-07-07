import com.java.courses.db.BDUniversity;
import com.java.courses.university.Student;
import com.java.courses.university.Subject;

import java.io.IOException;
import java.sql.SQLException;

public class TestBD {
    public static void main(String[] args) throws IOException, SQLException {

        BDUniversity bd = BDUniversity.getInstance();

        System.out.println("Get students from BD:");
        for (Student student : bd.getStudents()) {
            System.out.print(student.getLastname() + " / ");
            System.out.print(student.getFirstname() + " / ");
            System.out.print(student.getAge() + "\n");
        }

        System.out.println("Get subjects from BD:");
        for (Subject subject : bd.getSubjects()) {
            System.out.print(subject.getName() + " / ");
            System.out.print(subject.getHours() + " / ");
            System.out.print(subject.getTeacher().getLastname() + " / ");
            System.out.print(subject.getTeacher().getFirstname() + "\n");
        }
    }
}
