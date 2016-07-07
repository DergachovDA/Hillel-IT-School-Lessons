package com.java.courses.servlets;

import com.java.courses.db.BDUniversity;
import com.java.courses.university.Student;
import com.java.courses.university.Subject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class SubjectsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");

        writer.println("<h1>Subjects:</h1>");
        writer.println(getSubjectTable());
        writer.println("<br><a href=\"#\" onclick=\"history.back();\"><- Back</a>");
        writer.println("</body>");
        writer.println("</html>");
    }

    private String getSubjectTable() {

        String str = "";

        try {
            BDUniversity bd = BDUniversity.getInstance();
            List<Subject> subjects = bd.getSubjects();

            str += "<table width=100% height=\"200px\" border=1>\n";

            str += "<tr>\n";
            str += "<td><b>Name</b></td>\n";
            str += "<td><b>Hours</b></td>\n";
            str += "<td><b>Lastname</b></td>\n";
            str += "<td><b>Firstname</b></td>\n";
            str += "</tr>\n";

            for (Subject subject : subjects) {
                str += "<tr>\n";
                str += "<td>" + subject.getName() + "</td>\n";
                str += "<td>" + subject.getHours() + "</td>\n";
                str += "<td>" + subject.getTeacher().getLastname() + "</td>\n";
                str += "<td>" + subject.getTeacher().getFirstname() + "</td>\n";
                str += "</tr>\n";
            }

            str += "</table>";

        } catch (SQLException e) {
            str = "<p>Error</p>";
        }

        return str;
    }

}
