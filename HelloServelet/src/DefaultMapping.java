import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(urlPatterns = "/")
public class DefaultMapping extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*System.out.println("Default Mapping Is Working");*/
        PrintWriter writer = response.getWriter();
        /*System.out.println("Default Mapping Is Working");*/
        writer.println("Default Mapping Is Working");       // Postman eke read karranna use krnw
    }
}
