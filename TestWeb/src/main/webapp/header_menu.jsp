<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <tr style="height:200px" >
      <td>
       <a href="MySchool.jsp"> Logo </a>
      </td>
      <td colspan="3" >
        <h1 align="center" style="font-size:50px;" >Guru kalvai </h1>
      </td>
      <td>
      <% 
		HashMap<String, String> userDetailsMap= (HashMap) session.getAttribute("userObject");
      String userType = (String)userDetailsMap.get("userType");
%>
      	<%= (String)userDetailsMap.get("userName") %> &nbsp;&nbsp;&nbsp; (<%= userType %>)  
      	
      </td>
   
  </tr>
  <tr style="height:50px">
    <td>

    </td>
    <td colspan="4" >

      <table width="80%" align="right" >
        <tr>
          <td>
            <a href="principal.jsp"> Principal </a>
          </td>
          <%
          	if(!userType.equals("student")){
          %>
          <td>
            <a href="Staff.jsp">Staff</a>
          </td>
          <td>
          <a href="admission.jsp"> Admission </a>
          </td>
          <% } %>
          <td>
           <a href="Department.html">Department</a>
          </td>
          <td>
            <a href="LogoutServlet">Logout</a>
          </td>
        </tr>
      </table>
    </td>

  </tr>