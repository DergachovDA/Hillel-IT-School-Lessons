package com.java.courses.servlets;

import com.java.courses.db.BDUniversity;
import com.java.courses.university.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class StudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students;

        try {
            BDUniversity.UNIVERSITY.connect();
            students = BDUniversity.UNIVERSITY.getStudents();

            PrintWriter writer = resp.getWriter();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<table width=100% height=\"200px\" border=1>");
            writer.println("<tr>");
            writer.println("<td>Lastname</td>");
            writer.println("<td>Firstname</td>");
            writer.println("<td>Age</td>");
            writer.println("</tr>");

            for (Student student : students) {
                writer.println("<tr>");
                writer.println("<td>" + student.getLastname() + "</td>");
                writer.println("<td>" + student.getFirstname() + "</td>");
                writer.println("<td>" + student.getAge() + "</td>");
                writer.println("</tr>");
            }

            writer.println("</table>");
            writer.println("</body>");
            writer.println("</html>");

        } catch (SQLException e) {
            PrintWriter writer = resp.getWriter();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<p>Error</p>");
            writer.println("</body>");
            writer.println("</html>");
        }


    }

}
