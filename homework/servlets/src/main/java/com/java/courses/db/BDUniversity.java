package com.java.courses.db;

import com.java.courses.university.Student;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public enum  BDUniversity {

    UNIVERSITY();

    private Connection connection;

    public boolean connect() throws IOException, SQLException {
        Properties properties = this.loadProperties();

        Connection connection = DriverManager.
                getConnection(properties.getProperty("url"),
                        properties.getProperty("username"),
                        properties.getProperty("password"));


        this.connection = connection;
        return true;
    }

    private Properties loadProperties() throws IOException{
        Properties properties = new Properties();
        InputStream stream = getClass().getResourceAsStream("db.properties");
        properties.load(stream);
        return properties;
    }

    public List<Student> getStudents() throws SQLException {
        String sql = "SELECT lastname, firsname, age FROM students";
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
