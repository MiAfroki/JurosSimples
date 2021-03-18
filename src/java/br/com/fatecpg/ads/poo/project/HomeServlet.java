package br.com.fatecpg.ads.poo.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Milena Camargp
 */
@WebServlet(urlPatterns = {"/home.php"})
public class HomeServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><center>Milena Camargo Reis, RA:	1290481822051</center></head>");
             /*Tag meta Responsiva*/
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
             /*Google fonts - footer*/
            out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
             /*Favicon*/

            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1)_1.ico\" />");

            out.println("<title> JurosWeb </title>");    

             /*Inicio Cards de calculo de juros*/
            out.println("<div class='row' style=\"width: 80%;position: relative;left: 7%;\">" + 
            "<div class='col-sm-6'>" +
            "<div class=\"card border-primary mb-3\" style=\"max-width: 30rem;\"\n >" +
            "<div class='card-body' style=\"background-color: pink;border-color: black;\">" +
            "<center><h5 class='card-title'>Juros Simples</h5></center>" +
            "<hr>"+            
            "<center><p class='card-text'>Clique aqui para calcular juros simples." +
            " Juros simples é \"um valor de algo corrigido sob um tal valor que se aplica ao decorrer dos dias\".</p></center>" + 
            "<br>" +       
            "<center><a href='juros-simples.php' class='btn btn-primary' style=\"background-color: lightseagreen;border-color: lightseagreen;color: black;\">Calcular</a></center>" +
            "</div>" +
            "</div>" +
            "</div>" +
                    
            "<div class='col-sm-6' style=\"position: relative;center: 13%;\">" +
            "<div class=\"card border-secondary mb-3\" style=\"max-width: 30rem;\" \n >" +
            "<div class='card-body' style=\"background-color: pink;border-color: black;\">" +
           
            "<hr>"+            
 
            "<br>" +        
            " </div>" +
            "</div>" +
            "</div>" +
            "</div>");
            
            
            out.println("<br>");
            
 
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            
            out.println("</body>");
            out.println("</html>");
        }
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
