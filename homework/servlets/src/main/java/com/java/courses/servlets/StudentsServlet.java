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

public class StudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");

        try {
            BDUniversity bd = BDUniversity.getInstance();

            writer.println("<table width=100% height=\"200px\" border=1>");

            writer.println("<tr>");
            writer.println("<td>Lastname</td>");
            writer.println("<td>Firstname</td>");
            writer.println("<td>Age</td>");
            writer.println("</tr>");

            for (Student student : bd.getStudents()) {
                writer.println("<tr>");
                writer.println("<td>" + student.getLastname() + "</td>");
                writer.println("<td>" + student.getFirstname() + "</td>");
                writer.println("<td>" + student.getAge() + "</td>");
                writer.println("</tr>");
            }

            writer.println("</table>");

        } catch (SQLException e) {

            writer.println("<p>Error</p>");

        } finally {

            writer.println("</body>");
            writer.println("</html>");
        }


    }

}
