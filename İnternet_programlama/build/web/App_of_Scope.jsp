<%-- 
    Document   : App_of_Scope
    Created on : 2022 Jan 5, 21:28:30
    Author     : Devrim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        application.setAttribute("author", "Emine");
        application.setAttribute("Site", "BeginnesBook.com");
        %>
        <a href="displayyy.jsp">Click</a>
    </body>
</html>
