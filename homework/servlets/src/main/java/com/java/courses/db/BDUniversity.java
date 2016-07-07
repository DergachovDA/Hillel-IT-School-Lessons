package com.java.courses.db;

import com.java.courses.university.Grade;
import com.java.courses.university.Student;
import com.java.courses.university.Subject;
import com.java.courses.university.Teacher;

import java.io.IOException;
import java.io.InputStream;
import java.lang.management.GarbageCollectorMXBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BDUniversity {

    static final String DB_URL = "jdbc:mysql://revivalc.mysql.ukraine.com.ua:3306/revivalc_test?serverTimezone=UTC&useSSL=false";
    static final String USER = "revivalc_test";
    static final String PASS = "1234";

    private Connection connection;
    private static BDUniversity instance;

    private BDUniversity() {
        try {
            isConnect();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static BDUniversity getInstance() {
        if (instance == null)
            instance = new BDUniversity();
        return instance;
    }

    private boolean isConnect() throws IOException, SQLException, ClassNotFoundException {
        Properties properties = loadProperties();
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DB_URL,USER,PASS);
//        connection = DriverManager.
//                getConnection(properties.getProperty("url"),
//                        properties.getProperty("username"),
//                        properties.getProperty("password"));

        return true;
    }

    private Properties loadProperties() throws IOException{
        Properties properties = new Properties();
        InputStream stream = getClass().getResourceAsStream("db.properties");
        properties.load(stream);
        return properties;
    }

    public List<Student> getStudents() throws SQLException {
        String sql = "SELECT lastname, firstname, age FROM students;";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        ResultSet resultSet = statement.getResultSet();
        List<Student> students = new ArrayList<Student>();

        while (resultSet.next()) {

            String lastname = resultSet.getString("lastname");
            String firstname = resultSet.getString("firstname");
            int age = resultSet.getInt("age");

            students.add(new Student(lastname, firstname, age));
        }

        return students;
    }

    public List<Subject> getSubjects() throws SQLException {
        String sql = "SELECT subjects.name, subjects.hours, teachers.lastname, teachers.firstname " +
                "FROM subjects " +
                "INNER JOIN teachers ON subjects.teacher_id = teachers.id ";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        ResultSet resultSet = statement.getResultSet();
        List<Subject> subjects = new ArrayList<Subject>();

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int hours = resultSet.getInt("hours");
            String lastname = resultSet.getString("lastname");
            String firstname = resultSet.getString("firstname");

            subjects.add(new Subject(name, hours, new Teacher(lastname, firstname)));
        }

        return subjects;
    }

    public List<Grade> getGrades() throws SQLException {
        String sql = "SELECT st.firstname, st.lastname, su.name, g.grade " +
                "FROM grades AS g " +
                "INNER JOIN students AS st ON st.id = g.student_id " +
                "INNER JOIN subjects AS su ON su.id = g.subject_id";
        Statement statement = connection.createStatement();
        statement.execute(sql);

        ResultSet resultSet = statement.getResultSet();
        List<Grade> grades = new ArrayList<Grade>();

        while (resultSet.next()) {
            String firstname = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            String name = resultSet.getString("name");
            int grade = resultSet.getInt("grade");

            grades.add(new Grade(new Student(lastname, firstname), new Subject(name), grade));
        }

        return grades;
    }

}
