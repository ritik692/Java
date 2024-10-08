package com.example;

// HelloServletAnnotation.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Annotation-based mapping
@WebServlet("/helloServletAnnotation")
public class HelloServletAnnotation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        // Get the username parameter from the HTML form
        String username = request.getParameter("username");
        // Output HTML to the client
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + username + "!</h1>");
        out.println("</body></html>");
    }
}
