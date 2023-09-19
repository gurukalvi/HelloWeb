
<%@page import="java.util.HashMap"%>
<html>
<head>
    <title>Student Marks Input</title>
   <style>

h1 {text-align: center;}
  stud_header{
  font-family:sans-serif;  font-size:24px;
  font-style:italic;
  fort-weight:bold;
  color:hotpink;
  text-align:centre;
  text-decoration:underline
  
  }
  table{
	  
	  width:100% ;
	  border:100;
font-family:verdana;

 font-size:16px;
  font-style:normal;
  font-weight:bold;
           
  border-collapse: collapse;
  border:4px solid ;
  border-style:groove;
}

  table.inner{
  border:5px
  }
  input[type=text], input[type=email],input[type=number]{
  width:50%;
  padding:5px 12px;
  margin:5px 0;
  box-sizing:border-box;
  }
  input[type=submit],input[type=reset]{
   width:15%;
  padding:8px 12px;
  margin:5px 0;
  box-sizing:border-box;
  }
</style>
</head>
<body>


    <h1 class="stud_header" >Student Marks Input</h1>
<form action="StudentMarkServlet" method="post">
	
	
    <table>	
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
   <%                   %>
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
            
