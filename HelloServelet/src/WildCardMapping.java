import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/auth/*")
public class WildCardMapping extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*System.out.println("Wild Card Mapping Works");*/
        PrintWriter writer = response.getWriter();
        /*System.out.println("Wild Card Mapping Works");*/
        writer.println("Wild Card Mapping Works");      // Postman eke read karranna use krnw
    }
}
