<%-- 
    Document   : page2
    Created on : 7 janv. 2021, 10:39:54
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%--
<jsp:useBean id = "TSBean" class = "TechSupport.Personne" scope = "page">
    <jsp:setProperty name = "TSBean" property = "user" param = "user" />
--%>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Informations de la personne</title>
        </head>
        <body>
            <H1>Saisissez les renseignements de la personne.</H1>
            <FORM METHOD=POST ACTION="/MVC/TechSupportServlet">
                <BR>
                Utilisateur : <%-- <jsp:setProperty name = "TSBean" property = "user"/> --%>
                <BR>
                <TABLE>
                    <TR>
                        <TD>Nom :</TD>
                        <TD><INPUT TYPE=TEXT NAME="nom"></TD>
                    </TR>
                    <TR>
                        <TD>Prénom :</TD>
                        <TD><INPUT TYPE=TEXT NAME="prenom"></TD>
                    </TR>
                    <TR>
                        <TD>Téléphone :</TD>
                        <TD><INPUT TYPE=TEXT NAME="telephone"></TD>
                    </TR>
                </TABLE>
                <BR><INPUT TYPE=SUBMIT NAME="submit" VALUE="Valider">
            </form>
        </body>
    </html>
    <%--
</jsp:useBean>
    --%>