<%-- 
    Document   : page2
    Created on : 7 janv. 2021, 10:39:54
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informations de la personne</title>
    </head>
    <body bgcolor="#FFFFFF">
        <jsp:useBean id="user" class="TechSupport.Personne" scope="session" />

        <H1>Saisissez les renseignements de la personne.</H1><br><br>

        <FORM METHOD="get" ACTION="index.html">
                <BR>
                Utilisateur :  <%= user.user %><BR>
                <TABLE>
                    <TR>
                        <TD>Nom :</TD>
                        <TD><INPUT TYPE=TEXT NAME="nom"></TD>
                    </TR>
                    <TR>
                        <TD>Prénom :</TD>
                        <TD><INPUT TYPE=TEXT NAME="prenom" ></TD>
                    </TR>
                    <TR>
                        <TD>Téléphone :</TD>
                        <TD><INPUT TYPE=TEXT NAME="telephone"></TD>
                    </TR>
                </TABLE>
                <BR><INPUT TYPE=SUBMIT VALUE="Valider">
                <input type = "hidden" name = "formulaire" value = "personne" />
            </form>
        </body>
    </html>