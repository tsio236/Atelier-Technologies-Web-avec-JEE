<%-- 
    Document   : exception
    Created on : 7 janv. 2021, 12:12:35
    Author     : tsior
--%>

<%@page  language="java"%>
<!DOCTYPE html>
<html>
    <body bgcolor="#FFFFFF">
        <h1>Une exception est arrivée.</h1>
        
        <jsp:useBean id="exception" class="java.lang.Exception" scope="request" />
        Classe : <%= exception.getClass() %><br/>
        Message : <%= exception.getMessage() %><br/><br/>
        Pile d'appel : <br>
        
        <% StackTraceElement [] élément = exception.getStackTrace();
            int i;
            for (i = 0; i < élément.length; i++)
            {
                out.println (élément[i].toString() + "<br/>");
            }
        %>
    </body>
</html>
