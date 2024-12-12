import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "*.txt")
public class ExtensionMapping extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*System.out.println("Extension Mapping Working");*/
        PrintWriter writer = response.getWriter();
        /*System.out.println("Extension Mapping Working");*/
        writer.println("Extension Mapping Working");       // Postman eke read karranna use krnw
    }
}
