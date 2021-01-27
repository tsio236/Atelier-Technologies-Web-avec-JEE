<%-- 
    Document   : index
    Created on : 17 déc. 2020, 10:25:33
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enregistrement du client</title>
    </head>
    <body bgcolor="#FFFFFF">
        
        <jsp:useBean id="user" class="TechSupport.Personne" scope="session" />
        
        <CENTER><H1>Enregistrement du client</H1></CENTER>
        <HR>
        Email : <%= user.email %>
        Informations requises :
        <form action = 'index.html' method = 'get'>
            <BR>
            <TABLE>
                <TR>
                    <TD>Prénom :</TD>
                    <TD><INPUT TYPE=TEXT NAME="prénom"></TD>
                </TR>
                <TR>
                    <TD>Nom :</TD>
                    <TD><INPUT TYPE=TEXT NAME="nom"></TD>
                </TR>
                <TR>
                    <TD>Téléphone :</TD>
                    <TD><INPUT TYPE=TEXT NAME="téléphone"></TD>
                </TR>
            </TABLE>
            <BR><INPUT TYPE=SUBMIT NAME="submit" VALUE="Soumettre la requête">
            <input type = 'hidden' name = 'formulaire' value = 'personne' />
        </FORM>
    </body>
</html>
