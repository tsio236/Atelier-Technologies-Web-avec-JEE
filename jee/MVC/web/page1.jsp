<%-- 
    Document   : page1
    Created on : 7 janv. 2021, 10:39:24
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Utilisateur</title>
    </head>
    <body bgcolor="#FFFFFF">
        <FORM action = 'index.html' method = 'get'>
            Utilisateur :
            <INPUT TYPE="Text" NAME="user" ALIGN="LEFT" SIZE="25">
            <BR><BR>
            <INPUT TYPE="submit" VALUE="Valider">
            <input type = 'hidden' name = 'formulaire' value = 'user' />
        </form>
    </body>
</html>
