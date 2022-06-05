<%-- 
    Document   : rekursif.jsp
    Created on : 2022 Jan 5, 20:15:04
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
        <form name="secenek_formu" action="gonder.jsp" method="post">
            <input name="radioButton" type="radio" value="dogru" checked="checked" />a
            <input name="radioButton" type="radio" value="yanlis"  />b  
            <input name="radioButton" type="radio" value="belki"  />c   
            <input name="kaydet" type="submit" value="gonder" />
        </form>
       
    </body>
</html>
