 <% 
		HashMap<String, String> userDetailsMap2= (HashMap) session.getAttribute("userObject");
     if(userDetailsMap2!=null){
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Test</title>
</head>
<body>
<!-- #rrggbb rr 0-9 a b c d e f -->
<table style="height:100%;width:100%"  align="center" bgcolor="#acdce6" >
	<%@ include file="header_menu.jsp" %>
  <tr style="height:500px" >
    <td>

    </td>
    <td colspan="4" align="right;" >
      <img src="collegeee.jpg" sizes="50%" style="
    width: 800px;
    align-content: right;" >
    </td>

  </tr>
  <tr style="height:150px">
    <td>
      College Ranks
    </td>
    <td>
      University Details
    </td>
    <td>
      Cultural Photos
    </td>
    <td>
      National Events
    </td>
    <td>
      Sports
    </td>
  </tr>

</table>


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