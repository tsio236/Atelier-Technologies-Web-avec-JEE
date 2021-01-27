<%-- 
    Document   : banner
    Created on : 30 déc. 2020, 12:04:15
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id = "TSBean" class = "TechSupport.TechSupportBean" scope = "page">
    <jsp:setProperty name = "TSBean" property = "email" param = "email" />
    <jsp:setProperty name = "TSBean" property = "logiciel" param = "logiciel" />
    <jsp:setProperty name = "TSBean" property = "os" param = "os" />
    <jsp:setProperty name = "TSBean" property = "probleme" param = "probleme" />
    <jsp:setProperty name = "TSBean" property = "prenom" param = "prenom" />
    <jsp:setProperty name = "TSBean" property = "nom" param = "nom" />
    <jsp:setProperty name = "TSBean" property = "telephone" param = "telephone" />
    Utilisateur : <jsp:setProperty name = "TSBean" property = "prenom"/> <jsp:setProperty name = "TSBean" property = "nom"/>
    Téléphone : <jsp:setProperty name = "TSBean" property = "telephone"/>
    Email : <jsp:setProperty name = "TSBean" property = "email"/>
    Logiciel : <%=TSBean.getLogiciel()%>
    Système d'exploitation : <%=TSBean.getSystemeExploitation()%>
    Description du problème : <%=TSBean.getDescription()%>
    <HR>
</jsp:useBean>

