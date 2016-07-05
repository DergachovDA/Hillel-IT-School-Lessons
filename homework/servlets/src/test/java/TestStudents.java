import com.java.courses.db.BDUniversity;
import com.java.courses.university.Student;

import java.io.IOException;
import java.sql.SQLException;

public class TestStudents {
    public static void main(String[] args) throws IOException, SQLException {

        BDUniversity bd = BDUniversity.getInstance();

        for (Student student : bd.getStudents()) {
            System.out.print(student.getLastname() + " / ");
            System.out.print(student.getFirstname() + " / ");
            System.out.print(student.getAge() + "\n");
        }
    }
}
