package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServeletAutenticar", urlPatterns = {"/ingresar"})
public class ServeletAutenticar extends HttpServlet {

 
   
     
     public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application / vnd.ms-excel");
        PrintWriter salida = response.getWriter();
        salida.println ("yo soy armando");
         
    }

 }
