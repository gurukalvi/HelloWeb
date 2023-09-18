<!DOCTYPE html>
<%@page import="java.util.HashMap"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Homepage</h1><br>
<% 
		HashMap<String, String> userDetailsMap= (HashMap) session.getAttribute("userObject");
%>

<span style="position: 10, 100;" >LoggedIn User : <%= (String)userDetailsMap.get("userName") %>  </span> <br>
<span style="position: 10, 100;" >LoggedIn User Roll : <%= (String)userDetailsMap.get("userType") %>  </span><br>
<a href="AllStudentDetailsServlet">Get Student Details</a><br>
 
</body>
</html>