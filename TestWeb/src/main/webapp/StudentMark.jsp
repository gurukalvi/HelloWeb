<!DOCTYPE html>
<%@page import="java.util.HashMap"%>
<html>
<head>
    <title>Student Marks Input</title>
    <style>
		h1 {
				outline: #4CAF50 solid 5px;
  border: 5px solid yellow;
  border-radius: 12px;
  padding: 5px;
  color: hotpink;}
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
           background:linear-gradient(to bottom ,pink,#9FE2BF 125%);
        }
        table{
			border-collapse: collapse;
  border:4px solid ;
  border-style:outset;
		}
        
    </style>
     
</head>
<body>
<div style="width: 100%;height: 100%;vertical-align: middle;">  

	
<div style="position: relative;
    vertical-align: middle;
    align-content: center;
    padding-left: 500px;
    padding-top: 150px;" >
<form action="StudentMarkServlet" method="post">
	
	<% 
		HashMap<String, String> userDetailsMap= (HashMap) session.getAttribute("userObject");
%>

<span style="position: 10, 100;" >LoggedIn User : <%= (String)userDetailsMap.get("userName") %>  </span> <br>
<span style="position: 10, 100;" >LoggedIn User Roll : <%= (String)userDetailsMap.get("userType") %>  </span><br>
<a href="StudentDetailServlet">Get Student Details</a><br>

	
    <table>	
		<tr><td colspan="2" align="center" >
		<h1>Student Marks Input</h1>
		<style>
h1 {
  text-shadow: 2px 2px;
}
</style>
		</td>
		</tr>
        <!------------MarkID
        -------------------------->
        <tr>
        <td style="width: 100px," >Mark ID</td>
        <td>
			<input type="text" name="MarkID"maxlength="50" />
       
        </td>
        </tr>
        <!-----------------------Test_type
        --------------------------------->
            <tr>
            <td>Test Type</td>
            <td> 
				<input type="text" name="TestType" maxlength="100" />
               
            </td>
            </tr>
         <!-----------------------StudentId
    --------------------------------->
        <tr>
        <td>Student ID</td>
        <td>
			<input type="text" name="StudentID" />
            
        </td>
        </tr>

 <!-----------------------Tamil_Mark
    --------------------------------->
        <tr>
        <td>Tamil Mark</td>
        <td>
			<input type="text" name="TamilMark" maxlength="50" />
          
        </td>
        </tr>
        <!-----------------------English_Mark
   --------------------------------->
            <tr>
            <td>English Mark</td>
            <td>
				<input type="text" name="EnglishMark"maxlength="50" />
                
            </td>
            </tr> 
            
        <!-----------------------Maths_Mark
   --------------------------------->
            <tr>
            <td>Maths Mark</td>
            <td>
				<input type="text" name="MathsMark"maxlength="50" />
                
            </td>
            </tr>
            
            
        <!-----------------------ScienceMark
   --------------------------------->
            <tr>
            <td>Science Mark</td>
            <td>
				<input type="text" name="ScienceMark"maxlength="50" />
                
            </td>
            </tr>
            
                    <!----------------------SocialMark
   --------------------------------->
            <tr>
            <td>Social Mark</td>
            <td>
				<input type="text" name="SocialMark"maxlength="50" />
                
            </td>
            </tr>
             
                        <!----------------------Computer_Mark
   --------------------------------->
            <tr>
            <td>Computer Mark</td>
            <td>
				<input type="text" name="ComputerMark"maxlength="50" />
                
            </td>
            </tr>
            
             <!----------------------Total_Working_Days
   --------------------------------->
            <tr>
            <td>Total Working Days</td>
            <td>
				<input type="text" name="TotalWorkingDays"maxlength="50" />
                
            </td>
            </tr>
            
             <!----------------------Present_Days
   --------------------------------->
            <tr>
            <td>Present Days</td>
            <td>
				<input type="text" name="PresentDays"maxlength="50" />
                
            </td>
            </tr>
            
            <!----------------------Remark
   --------------------------------->
   <tr><td>Remarks:</td></tr>
            <tr><td>
            <textarea id="w3review" name="w3review" rows="4" cols="40">
            </textarea>
            </td>
            </tr>
            <!----------------------- Submit and Reset                           
        ------------------------------->
            <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Submit">
                <input type="reset" value="Reset">
            
            </td>
            </tr>
            </table>
            </form>
            </div>
            </div>
            </body>
            </html>