/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "Ejer3", urlPatterns = {"/Ejer3"})
public class Ejer3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<title>Servlet Ejer3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p><a href='Main'>Volver Practica 1 </a></p>");
            out.println("<p>EJERCICIO 3</p>");
            out.println("<form action='SolEjer3' method='post'>");
            out.println("<label>Año de Nacimiento:</label>");
            out.println("<input type='text' name='nacimiento'><br>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("</form>");
            out.println("");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
