package com.java.courses.servlets;

import com.java.courses.db.BDUniversity;
import com.java.courses.university.Grade;
import com.java.courses.university.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class GradesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");

        writer.println("<h1>Grade:</h1>");
        writer.println(getGradesTable());
        writer.println("<br><a href=\"#\" onclick=\"history.back();\"><- Back</a>");
        writer.println("</body>");
        writer.println("</html>");
    }

    private String getGradesTable() {

        String str = "";

        try {
            BDUniversity bd = BDUniversity.getInstance();
            List<Grade> grades = bd.getGrades();

            str += "<table width=100% height=\"200px\" border=1>\n";

            str += "<tr>\n";
            str += "<td><b>Lastname</b></td>\n";
            str += "<td><b>Firstname</b></td>\n";
            str += "<td><b>Subject</b></td>\n";
            str += "<td><b>Grade</b></td>\n";
            str += "</tr>\n";

            for (Grade grade : grades) {
                str += "<tr>\n";
                str += "<td>" + grade.getStudent().getLastname() + "</td>\n";
                str += "<td>" + grade.getStudent().getFirstname() + "</td>\n";
                str += "<td>" + grade.getSubject().getName() + "</td>\n";
                str += "<td>" + grade.getGrade() + "</td>\n";
                str += "</tr>\n";
            }

            str += "</table>";

        } catch (SQLException e) {
            str = "<p>Error</p>";
        }

        return str;
    }

}
