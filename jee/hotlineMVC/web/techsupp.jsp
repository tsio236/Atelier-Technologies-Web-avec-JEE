<%-- 
    Document   : techsupp
    Created on : 20 janv. 2021, 18:48:49
    Author     : tsior
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <HEAD>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <TITLE>Site de maintenance</TITLE>
    </HEAD>
    
    <BODY bgcolor="#FFFFFF">

        <H1>Demande du support technique</H1>
        <HR><BR>
        <CENTER>
            <FORM action = 'index.html' method = 'get'>
                <TABLE ALIGN="center" WIDTH="100%" CELLSPACING="2" CELLPADDING="2">
                    <TR>
                        <TD ALIGN="right">Email :</TD>
                        <TD><INPUT TYPE="Text" NAME="email" ALIGN="LEFT" SIZE="25"></TD>
                    </TR>
                    <TR>
                        <TD ALIGN="right">Logiciel :</TD>
                        <TD>
                            <SELECT NAME="logiciel" SIZE="1">
                                <OPTION VALUE="Word">Microsoft Word</OPTION>
                                <OPTION VALUE="Excel">Microsoft Excel</OPTION>
                                <OPTION VALUE="Access">Microsoft Access</OPTION>
                                <option value="Ppt">Microsoft PowerPoint</option>
                            </SELECT>
                        </TD>
                        <TD ALIGN="right">Système d'exploitation:</TD>
                        <TD>
                            <SELECT NAME="os" size="1">
                                <OPTION VALUE="Xp">Windows XP</OPTION>
                                <OPTION VALUE="Linux">Linux</OPTION>
                                <OPTION VALUE="Mac">Mac OS</OPTION>
                            </SELECT>
                        </TD>
                    </TR>
                </TABLE>
                <BR>Description du problème
                <BR>
                <TEXTAREA NAME="problème" COLS="50" ROWS="10"></TEXTAREA>
                <HR><BR>
                <INPUT TYPE="Submit" NAME="submit" VALUE="Soumettre la requête">
                <input type = 'hidden' name = 'formulaire' value = 'user' />
            </FORM>
        </CENTER>
    </body>
</html>
