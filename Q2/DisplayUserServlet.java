package org.nisum;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/displayUser")
public class DisplayUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        response.setContentType("text/html");
        response.getWriter().println("<h2>User Details</h2>Name: " + name + "<br>Email: " + email);
    }
}
