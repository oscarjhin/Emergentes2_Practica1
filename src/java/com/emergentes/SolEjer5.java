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
@WebServlet(name = "SolEjer5", urlPatterns = {"/SolEjer5"})
public class SolEjer5 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int res=0;
        String res2="";
        String men="";
        int numA= Integer.parseInt(request.getParameter("numA"));
        int numB= Integer.parseInt(request.getParameter("numB"));
        int ope= Integer.parseInt(request.getParameter("operador"));

        
         switch (ope)
         {
            case 1:
                men="Suma";
                res=numA+numB;
                res2=res+"";
                break;
            case 2:
                men="Resta";
                res=numA-numB;
                res2=res+"";
                res2=res+"";
                break;
            case 3:
                men="Multiplicacion";
                res=numA*numB;
                res2=res+"";
                break;
            case 4:
                men="Division";
                if(numB!=0)
                {
                    res=numA/numB;
                    res2=res+"";
                }
                    else
                {
                    res=0;
                    res2="No existe division entre cero";
                }
                break;

            default:
                    System.out.println("Número no reconocido");
                    break;
         }
     
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolEjer3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Num A: " +numA+ "</h1>");
            out.println("<h1>Num B: " +numB+ "</h1>");
            out.println("<h1>" +men+ "</h1>");
            out.println("<h1>resultado: " +res2+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }



}
