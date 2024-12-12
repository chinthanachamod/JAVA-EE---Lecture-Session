import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("Hello World");*//*
        PrintWriter out = resp.getWriter();
        *//*out.println("doGet method is invoked !");*//*
        out.println("<h1 style=\"color:green;\">Name : Chinthana Chamod</h1>");*/

        String servletPath = req.getServletPath();
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        String method = req.getMethod();
        String pathInfo = req.getPathInfo();
        String remoteUser = req.getRemoteUser();
        /*------------------------------------------------*/


        System.out.println("Servlet Path : " + servletPath);
        System.out.println("Request URI : " + requestURI);
        System.out.println("Context Path : " + contextPath);
        System.out.println("Request Method : " + method);
        System.out.println("Path Information : " + pathInfo);
        System.out.println("Remote User : " + remoteUser);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("doPost method is invoked !");
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("doPut method is invoked !");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("doDelete method is invoked !");
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("doOptions method is invoked !");
    }
}
