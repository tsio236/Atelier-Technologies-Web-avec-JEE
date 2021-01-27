<%-- 
    Document   : page3
    Created on : 7 janv. 2021, 10:40:09
    Author     : tsior
--%>

<%@page language="java" import = "java.util.*, TechSupport.*"%>
<html>
    <body bgcolor="#FFFFFF">
        
        <title>Liste des utilisateurs</title>
        
        <jsp:useBean id = "listepersonne" class = "TechSupport.ListePersonne" scope = "application"/>
        <h1>Liste des utilisateurs enregistr�s</h1><br><br>
        <table border = '2'>
            <th>Utilisateur</th><th>Nom</th><th>Pr�nom</th><th>T�l�phone</th>
            
            <% Enumeration enu = listepersonne.liste.elements ();
            while (enu.hasMoreElements())
            {Personne personne = (Personne) enu.nextElement();
            %>
                    <tr>
                        <td><%= personne.user %></td>
                        <td><%= personne.nom %></td>
                        <td><%= personne.pr�nom %></td>
                        <td><%= personne.t�l�phone %></td>
                    </tr>
                <% } %>
                
                </table>
    </body>
</html>
