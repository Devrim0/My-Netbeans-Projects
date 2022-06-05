<%-- 
    Document   : index
    Created on : 2022 Jan 5, 20:32:02
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
        <h1>JSP include Sayfası</h1> <br>
        <jsp:include page="display.jsp">
        <jsp:param name="userid" value="ece"/>
        <jsp:param name="password" value="prgrm"/>
        <jsp:param name="name" value="internet programlama"/>
        <jsp:param name="age" value="27"/>
        </jsp:include>
        
      </body>
      
</html>
