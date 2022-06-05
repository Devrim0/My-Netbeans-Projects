<%-- 
    Document   : userdetails.jsp
    Created on : 2022 Jan 5, 22:04:11
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
        <jsp:useBean id="userinfo" class="com.devrim.Deneme"> </jsp:useBean>
        <jsp:setProperty property="*" name="userinfo"/>
        You have enterted below details:<br>
        <jsp:getProperty property="username" name="userinfo" /> <br>
        <jsp:getProperty property="password" name="userinfo"/> <br>
        <jsp:getProperty property="age" name="userinfo"/><br>
        </body>
</html>
