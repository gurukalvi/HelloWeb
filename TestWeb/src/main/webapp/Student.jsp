 <% 
		HashMap<String, String> userDetailsMap2= (HashMap) session.getAttribute("userObject");
     if(userDetailsMap2!=null){
%>


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
<a href="StudentDetailServlet">Get Student Details</a><br>
<% 

Cookie ck[]=request.getCookies();  
for(int i=0;i<ck.length;i++){  
 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
}  

%>
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