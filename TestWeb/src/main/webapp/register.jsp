 <%@page import="java.util.HashMap"%>
<%
		HashMap<String, String> userDetailsMap2= (HashMap) session.getAttribute("userObject");
     if(userDetailsMap2!=null){
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<%
     }
     else{
    	 System.out.println("inside the else block if userObject is null ");
    	 %>
    	 	<jsp:forward page="Login.jsp"></jsp:forward>
    	 <%
     }
%>