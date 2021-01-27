<%-- 
    Document   : register
    Created on : 30 déc. 2020, 12:31:04
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id = "TSBean" class = "TechSupport.TechSupportBean" scope = "page">
    <jsp:setProperty name = "TSBean" property = "prenom" param = "prenom" />
    <jsp:setProperty name = "TSBean" property = "nom" param = "nom" />
    <jsp:setProperty name = "TSBean" property = "telephone" param = "telephone" />
    <%
        String prenom = (String) TSBean.getPrenom();
        String nom = (String) TSBean.getNom();
        String telephone = (String) TSBean.getTelephone();
        TSBean.setPrenom(prenom);
        TSBean.setNom(nom);
        TSBean.setTelephone(telephone);
        response.sendRedirect("response.jsp");
    %>
</jsp:useBean>
