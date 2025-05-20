package org.nisum;

import java.io.*;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h2>Current Date and Time: " + new Date() + "</h2>");
    }
}
