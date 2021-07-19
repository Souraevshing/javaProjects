<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Exception ex=null;
   ex=(Exception)request.getAttribute("exception");
   out.println("Some Error occoured ! "+ex);
   ex.printStackTrace();
%>