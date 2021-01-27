/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //private final String driver =
    // "org.apache.derby.jdbc.EmbeddedDriver";
    protected final String url = "jdbc:derby://localhost:1527/hotline";
    
    protected final String driver = "org.apache.derby.jdbc.ClientDriver";
    
    protected final String tableName_supp_requests = "SUPP_REQUESTS";
    
    protected final String username = "razafina";
    
    protected final String password = "zoh3uoxeis";
             
    protected Connection getConnection()
            throws Exception {
        Class.forName(driver);
        // Establish network connection to database.
        Properties userInfo = new Properties();
        userInfo.put("user", username);
        userInfo.put("password", password);
        Connection connection =
                DriverManager.getConnection(url, userInfo);
        return(connection);
        }
    
    protected void createTable(PrintWriter out){
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String create_supp_requests = "CREATE TABLE " + tableName_supp_requests + "(id INT  PRIMARY KEY NOT NULL, PRENOM VARCHAR(10), "
                   + "NOM VARCHAR(10), EMAIL VARCHAR(50), TELEPHONE CHAR(10), LOGICIEL VARCHAR(20), OS VARCHAR(20), PROBLEME VARCHAR(10) )";
            ResultSet resultCreate = statement.executeQuery(create_supp_requests);
            String insert_supp_requests = "INSERT INTO " + tableName_supp_requests + "id, PRENOM, NOM, EMAIL, TELEPHONE, LOGICIEL, OS, PROBLEME"
                   + "VALUES ('1', 'Andrianihary', 'Razafindramisa', 'andrianihary.razafindramisa@edu.esiee.fr', '0666666666', 'NetBeans', 'Windows', 'problème')";
            ResultSet resultInsert = statement.executeQuery(insert_supp_requests);
        } catch (Exception ex) {
            Logger.getLogger(TechSupportServlet.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
      
    
    protected void showTable(PrintWriter out) {
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM " + tableName_supp_requests;
            ResultSet resultSet = statement.executeQuery(query);
            printTableTop(connection, resultSet, out);
            printTableBody(resultSet, out);
        } catch (Exception ex) {
            Logger.getLogger(TechSupportServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void printTableTop(Connection connection,
            ResultSet resultSet,
            PrintWriter out)
            throws SQLException {
        out.println("<TABLE BORDER='1'>");
        // Print headings from explicit heading names
        String[] headingNames =
        { "PRENOM", "NOM", "EMAIL",
            "TELEPHONE", "LOGICIEL", "OS", "PROBLEME" };
        out.print("<TR>");
        for (String headingName : headingNames) {
            out.printf("<TH>%s", headingName);
        }
        out.println();
    }
    
    protected void printTableBody(ResultSet resultSet,
            PrintWriter out)
            throws SQLException {
        while(resultSet.next()) {
            out.println("<TR ALIGN='RIGHT'>");
            out.printf(" <TD>%s", resultSet.getString("PRENOM"));
            out.printf(" <TD>%s", resultSet.getString("NOM"));
            out.printf(" <TD>%s", resultSet.getString("EMAIL"));
            out.printf(" <TD>%d", resultSet.getInt("TELEPHONE"));
            out.printf(" <TD>%s", resultSet.getString("LOGICIEL"));
            out.printf(" <TD>%s", resultSet.getString("OS"));
            out.printf(" <TD>%s", resultSet.getInt("PROBLEME"));
        }
        out.println("</TABLE>");
    }
    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
              
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {            
            String docType =
                    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
                    "Transitional//EN\"\n";
            String title = "Requests";
            out.print(docType +
                    "<HTML>\n" +
                            "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
                                    "<LINK REL='STYLESHEET' HREF='./css/styles.css'\n" +
                                    " TYPE='text/css'>" +
                                    "<BODY><CENTER>\n" +
                                    "<TABLE CLASS='TITLE' BORDER='5'>" +
                                    " <TR><TH>" + title + "</TABLE><P>");
            createTable(out);
            showTable(out);
            out.println("</CENTER></BODY></HTML>");
        }
    }
}
