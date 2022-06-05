<%-- 
    Document   : gonder
    Created on : 2022 Jan 8, 20:46:58
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
        <%! public boolean kullanici_kontrol(String isim,String soyad){
if(isim==null && soyad==null){
return false;
}

else{
return false;
}

}
        
        %>
        
     
  <%
  String isim=request.getParameter("isim");
  String soyad=request.getParameter("soyad");
  
if(kullanici_kontrol(isim,soyad)){
out.print("geçerli");
}
else{
out.print("Geçersiz");}
  %>   
  
  <br>
  <%=session.getAttribute("toplam_sonuc")%>
          
      
<%
int sayac=(int)application.getAttribute("sayac");
if(sayac==0){
sayac=1;
}
else{
sayac++;
}

application.setAttribute("sayac", sayac);
%>  
        
        
    </body>
</html>
