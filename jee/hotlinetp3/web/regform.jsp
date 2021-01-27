<%-- 
    Document   : index
    Created on : 17 déc. 2020, 10:25:33
    Author     : tsior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enregistrement du client</title>
    </head>
    <body>
        <CENTER><H1>Enregistrement du client</H1></CENTER>
        <HR>
        Informations requises :
        <form method="post" action="/JSP/register.jsp">
            <BR>
            <TABLE>
                <TR>
                    <TD>Prénom :</TD>
                    <TD><INPUT TYPE=TEXT NAME="prenom"></TD>
                </TR>
                <TR>
                    <TD>Nom :</TD>
                    <TD><INPUT TYPE=TEXT NAME="nom"></TD>
                </TR>
                <TR>
                    <TD>Téléphone :</TD>
                    <TD><INPUT TYPE=TEXT NAME="telephone"></TD>
                </TR>
            </TABLE>
            <BR><INPUT TYPE=SUBMIT NAME="submit" VALUE="Soumettre la requête">
        </FORM>
    </body>
</html>
