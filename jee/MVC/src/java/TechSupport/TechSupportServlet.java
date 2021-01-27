/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechSupport;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tsior
 */
@WebServlet(name = "TechSupportServlet", urlPatterns = {"/TechSupportServlet"})
public class TechSupportServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String formulaire = request.getParameter("formulaire");
        HttpSession session = request.getSession();
        
        if (formulaire == null) {
            /* Premier accès de l'utilisateur */
            RequestDispatcher disp = request.getRequestDispatcher("page1.jsp");
            disp.forward (request, response);
        }
        else {
            if (formulaire.equals("user"))
            {
                /* on vient de saisir le user/password */
                Personne personne = new Personne ();
                personne.user = request.getParameter("user");
                session.setAttribute("user", personne);
                /* si l'utilisateur est déjà connecté, on affiche la
                liste des utilisateurs connectés, sinon on affiche la
                fiche de saisie des renseignements de la personne */
                ServletContext context = getServletContext();
                ListePersonne listeUser = (ListePersonne) context.getAttribute ("listeuser");

                if (listeUser == null)
                    listeUser = new ListePersonne ();
            
                if (listeUser.isUserAlreadyRegistered(personne.user))
                {
                    /* afficher la liste des users */
                    RequestDispatcher disp = request.getRequestDispatcher("listeuser.jsp");
                    disp.forward (request, response);
                }
                else
                {
                    /* afficher la fiche de saisie de la personne */
                    RequestDispatcher disp = request.getRequestDispatcher("personne.jsp");
                    disp.forward (request, response);
                }
            }
            if (formulaire.equals("personne"))
            {
                /* on vient de saisir le formulaire de la personne
                (nom, prénom, téléphone) */
                /* on récupère la personne mise dans la session,
                pour la rajouter dans la listeuser en attribut
                d'application */
                Personne personne = (Personne) session.getAttribute("user");
                personne.nom = request.getParameter("nom");
                personne.prénom = request.getParameter("prénom");
                personne.téléphone = request.getParameter("téléphone");
            
                ServletContext context = getServletContext();
                ListePersonne listeUser = (ListePersonne) context.getAttribute ("listeuser");
            
                if (listeUser == null)
                    listeUser = new ListePersonne ();
            
                listeUser.liste.put(personne.user, personne);
            
                context.setAttribute("listeuser", listeUser);
            
                /* afficher la liste des users */
                RequestDispatcher disp = request.getRequestDispatcher("listeuser.jsp");
                disp.forward (request, response);
            }
        }
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
        doGet(request, response);
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
