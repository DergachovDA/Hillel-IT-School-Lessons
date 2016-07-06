package com.java.courses.db;

import com.java.courses.university.Student;

import java.io.IOException;
import java.io.InputStream;
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
        }
    }

    public static BDUniversity getInstance() {
        if (instance == null)
            instance = new BDUniversity();
        return instance;
    }

    private boolean isConnect() throws IOException, SQLException {
        Properties properties = loadProperties();
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
}
