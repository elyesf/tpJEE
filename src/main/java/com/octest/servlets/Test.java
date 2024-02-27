package com.octest.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Instantiate the model
		Auteur auteur = new Auteur();
        // Set properties (business logic)		
	    auteur.setPrenom("ahmed");
	    auteur.setNom("ben ahmed");
	    auteur.setActif(true);
	    
        // we can add any additional business logic here

	    request.setAttribute("auteur", auteur);
       
	    // Forward to the view

	    this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
