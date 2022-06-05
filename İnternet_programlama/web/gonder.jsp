<%-- 
    Document   : gonder
    Created on : 2022 Jan 5, 20:25:06
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
        String secenek=request.getParameter("radioButton");
        out.println("Seçeneğiniz:"+ secenek);
        %>
    </body>
</html>
