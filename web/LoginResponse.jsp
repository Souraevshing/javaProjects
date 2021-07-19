<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String usertype=(String)request.getAttribute("usertype");
    String userid=(String)request.getAttribute("userid");
    System.out.println("user id is"+userid);
     HttpSession sess=request.getSession();
     String url="";
     if(usertype!=null && userid!=null){
         sess.setAttribute("userid",userid);
         if(usertype.equalsIgnoreCase("admin")){
         url="AdminServlet;jsessinid="+sess.getId();
             }
         else{
               url="VoterServlet;jsessinid="+sess.getId();  
              }
     }
     out.println(url);
%>