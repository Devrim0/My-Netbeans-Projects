<%-- 
    Document   : newjsp
    Created on : 2022 Jan 8, 16:01:25
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
        <h1>Hello World!</h1>
        <%!
        int topla(int a,int b){
        return a+b;
        }
        %>
        
        <%out.println("Lokman Hekim");
        int sonuc=topla(6,8);
        session.setAttribute("toplam_sonuc", sonuc);
        %>
        
        <%=sonuc%>
        
        
        <form method="post" action="gonder.jsp">
            <% String s1="VERİ1";
            session.setAttribute("gonder1", s1); %>
            isim: <input type="text" name="isim"/><br>
            Soyad: <input type="text" name="soyad"/><br>
            <input type="submit" name="btn" id="b1" value="Gonder"/>
           
        </form>
        
            <form name="form" onsubmit="gonder.jsp">
                <p><input type="checkbox" name="sec" value="1" />1<p/>
                <p><input type="checkbox" name="sec" value="2" />2p/>
                <p><input type="checkbox" name="sec" value="3" />3<p/>
                <p><input type="checkbox" name="sec" value="4" />4<p/>
                <input type="submit" value="gonderr"/>
                
            </form>
            
    </body>
</html>
