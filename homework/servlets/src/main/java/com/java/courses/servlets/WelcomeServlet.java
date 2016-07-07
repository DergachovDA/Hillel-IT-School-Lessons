package com.java.courses.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>University database:</h1>");
        writer.println("<br><a href=\"University/students\">Get all students</a>");
        writer.println("<br><a href=\"University/subjects\">Get all subjects</a>");
        writer.println("</body>");
        writer.println("</html>");
    }
}