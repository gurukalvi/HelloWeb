<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Homepage</h1><br>
<span style="position: 10, 100;" >LoggedIn User : <%= (String)request.getAttribute("abc") %>  </span>
<a href="StudentDetailServlet?studentid=1">Get Student Details</a><br>
<% 

Cookie ck[]=request.getCookies();  
for(int i=0;i<ck.length;i++){  
 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
}  

%>
</body>
</html>