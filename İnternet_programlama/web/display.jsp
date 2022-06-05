<%-- 
    Document   : display
    Created on : 2022 Jan 5, 20:41:57
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
        <h1>Display JSP sayfası!</h1>
        UserID: <%=request.getParameter("userid")%> <br>
        Pasword is: <%=request.getParameter("password")%> <br>
        User Name: <%=request.getParameter("name")%><br>
        Age: <%=request.getParameter("age")%>
                
                
                
                
    </body>
</html>
