<%-- 
    Document   : response
    Created on : 30 déc. 2020, 11:31:18
    Author     : tsior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Support technique : Confirmation de la demande</title>
    </head>
    <body>
        <h1 align="center">Service de réponse client</h1>
        <HR>
        <h2>Requête reçue</h2>
        <% 
            RequestDispatcher rd = request.getRequestDispatcher("/banner");
            rd.include(request, response); %>
        <p>Merci pour votre requête et merci pour ces informations.</p>
        <p>Votre requête a été enregistrée et sera traitée dans trois jours.</p>
        <p>Votre problème sera résolu dans les 24 heures après le traitement de votre requête.</p>
        <HR><BR>       

    </body>
</html>

