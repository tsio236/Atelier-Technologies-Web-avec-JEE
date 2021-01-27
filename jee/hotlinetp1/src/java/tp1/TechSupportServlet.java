/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tsior
 */
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
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException cnfe) {
            throw new UnavailableException("Le driver n'est pas trouvé dans le classpath.");
        }
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String logiciel = request.getParameter("logiciel");
        String os = request.getParameter("os");
        String probleme = request.getParameter("probleme");
        Connection connection = null;
        String insertStatementStr = "insert into " +
                "supp_requests values ('"+prenom+"','"+ nom + "','"+ email+ "','"+ telephone +
                "','" + logiciel + "','"+ os + "','"+ probleme + "')";
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/hotline",
                    "pierre", "esiee");
            Statement insertStatement = connection.createStatement( );
            insertStatement.executeUpdate(insertStatementStr);
        } catch (SQLException sqle) {
            throw new ServletException("Erreur dans la base de données", sqle);
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) { }
            }
        }
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<HTML><HEAD><TITLE>");
        out.println("Support technique: Confirmation de la demande");
        out.println("</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H1>Support technique: Confirmation de la demande</H1>");
        out.println("Prenom : "+ prenom+"</br>");
        out.println("Nom : "+ nom+"</br>");
        out.println("Email : "+ email+"</br>");
        out.println("Telephone : "+ telephone+"</br>");
        out.println("Logiciel : "+ logiciel+"</br>");
        out.println("Systeme d'exploitation : "+ os+"</br>");
        out.println("Problème : "+ probleme+"</br></br>");
        out.println("Merci pour ces in formations.</br>");
        out.println("Votre problème sera résolue dans les 24 heures</br>");
        out.println("</BODY></HTML>");
        out.close();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TechSupportServlet.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TechSupportServlet.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

