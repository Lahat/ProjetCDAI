/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetCDAI.servlets;

import ejb.AnnonceSessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lahat
 */
public class AnnonceServlet extends HttpServlet {

private AnnonceSessionBean annoncebean;
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        
        String restaurateur = request.getParameter("restaurateur");
        String restaurant = request.getParameter("restaurant");
         String plagedispo = request.getParameter("plagedispo");
        String nbreplacedispo = request.getParameter("nbreplacedispo");
         String datededispo = request.getParameter("datededispo");
        String reduction = request.getParameter("reduction");
         String pourcreduction = request.getParameter("pourcreduction");
        
      
        annoncebean.creerAnnonce(restaurateur, restaurant, plagedispo, nbreplacedispo, datededispo, reduction, pourcreduction);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/LivreCreated.jsp").forward(request, response);
        
    }

}
