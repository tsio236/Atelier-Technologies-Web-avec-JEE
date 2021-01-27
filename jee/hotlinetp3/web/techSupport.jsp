<%-- 
    Document   : techSuppport
    Created on : 17 déc. 2020, 11:17:05
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id = "TSBean" class = "TechSupport.TechSupportBean" scope = "page">
    <jsp:setProperty name = "TSBean" property = "email" param = "email" />
    <jsp:setProperty name = "TSBean" property = "logiciel" param = "logiciel" />
    <jsp:setProperty name = "TSBean" property = "os" param = "os" />
    <jsp:setProperty name = "TSBean" property = "probleme" param = "probleme" />
    <%
        String email = (String) TSBean.getEmail();
        String logiciel = (String) TSBean.getLogiciel();
        String os = (String) TSBean.getSystemeExploitation();
        String description = (String) TSBean.getDescription();
        TSBean.setEmail(email);
        TSBean.setLogiciel(logiciel);
        TSBean.setSystemeExploitation(os);
        TSBean.setDescription(description);
        if(TSBean.getEmail().equals("andrianihary.razafindramisa@edu.esiee.fr")){
            TSBean.setPrenom("Andrianihary");
            TSBean.setNom("Razafindramisa");
            TSBean.setTelephone("0612345678");
            response.sendRedirect("response.jsp");
        }else{
            response.sendRedirect("regform.jsp");
        }
    %>

</jsp:useBean>