<%-- 
    Document   : banner
    Created on : 30 déc. 2020, 12:04:15
    Author     : tsior
--%>

<%@page language="java"  import = "java.util.*, TechSupport.*" contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="listeuser" class="TechSupport.Personne" scope="application" />
    Utilisateur :  <%= listeuser.prénom %> <%= listeuser.nom %>
    Téléphone : <%= listeuser.téléphone %>
    Email : <%= listeuser.email %>
    Logiciel : <%= listeuser.logiciel %>
    Système d'exploitation : <%= listeuser.os %>
    Description du problème : <%= listeuser.problème %>
    <HR>

