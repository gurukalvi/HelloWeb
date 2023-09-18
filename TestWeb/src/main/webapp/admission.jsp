<html>
<head>
    <title>Student Registration</title>
<style>
body {
			background-image: url('Kanis.jpg');
		}
h1 {text-align: center;}
  h1{
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
color:red greenyellow;
 font-size:16px;
  font-style:normal;
  font-weight:bold;
           background:linear-gradient(to bottom ,pink,#9FE2BF 125%);
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
	
<h1>Student Registration Form</h1>
<form action="AdmissionServlet" method="post">
    <table>
        <!------------First Name
        -------------------------->
        <tr>
        <td>First Name</td>
        <td>
			<input type="text" name="FirstName"maxlength="50" />
        </td>
        </tr>
        <!-----------------------Initial
        --------------------------------->
        <tr>
            <td>Initial</td>
            <td><input type="text" name="Initial" maxlength="3" />
            </td>
        </tr>
        <!-----------------------Student_ID
        --------------------------------->
        <tr>
            <td>Student ID</td>
            <td><input type="text" name="StudentID" maxlength="50" />
            </td>
        </tr>
        
          <!-----------------------RollNO
        --------------------------------->
        <tr>
            <td>RollNO</td>
            <td><input type="text" name="RollNO" maxlength="59" />
            </td>
        </tr>
        
        <!-----------------------CGPA
        --------------------------------->
        <tr>
            <td>CGPA</td>
            <td><input type="text" name="CGPA" maxlength="50" />
            </td>
        </tr>
        
        <!-----------------------Email ID
     --------------------------------->
        <tr>
            <td>Email ID</td>
            <td><input type="email" name="EmailID"maxlength="100" required   placeholder="........@gmail.com" />
            </td>
        </tr>
        <!-----------------------Mobile Number
   --------------------------------->
        <tr>
            <td>Mobile Number</td>
            <td><input type="text" name="Mobile Number"maxlength="10" placeholder="+91xxxxxxxxxx" />
            </td>
        </tr>
        <!-----------------------Gender
   --------------------------------->
        <tr>
            <td>Gender</td>
        <td>
        <input type="radio" name="Gender"value="Male"/> Male
            <input type="radio" name="Gender"value="Female"/> Female
            <input type="radio" name="Gender"value="Others"/> Others
        </td>
        </tr>
        <!-----------------------Date Of Birth
 --------------------------------->
        <tr>
            <td>Date of Birth(DOB)</td>
        <td>
        <input type="date" id="start" name="DOB" min="1980-01-01"  />
        </td>
        </tr>
       
        <!-----------------------Year
   --------------------------------->
        <tr>
            <td>Year</td>
            <td><input type="text" name="Year"maxlength="10" />
                (10 Digits Allowed)
               
            </td>
        </tr>
        
        <!-----------------------City
    --------------------------------->
<tr>
        <td>City</td>
        <td><input type="text" name="City" maxlength="50" placeholder="Place..."/>
    </td>
</tr>

        <!-----------------------PinCode
    --------------------------------->
<tr>
        <td>Pin Code</td>
        <td><input type="text" name="PinCode" maxlength="50" placeholder="Place..."/>
        </td>
</tr>

        <!-----------------------State
 --------------------------------->
        <tr>
            <td>State</td>
            <td><input type="text" name="State" maxlength="50" placeholder="State..."/>
            </td>
        </tr>
        <!-----------------------Country
 --------------------------------->
        <tr>
            <td>Country</td>
            <td><input type="text" name="Country" placeholder="Country..."/>
            </td>
            <input type="hidden" name="loggedinUser" value="Prasath" />
        </tr>
        <!-----------------------Hobbies
      --------------------------------->
        <tr>
        <td>Hobbies<br /><br /><br /></td>
        <td>
        <input type="checkbox" name="HobbyDrawing" value="Drawing"/>Drawing
            <input type="checkbox" name="HobbyCooking" value="Cooking"/>Cooking
            <input type="checkbox" name="HobbyPlaying" value="Playing"/>Playing
            <input type="checkbox" name="HobbyReading" value="Reading"/>Reading
            <input type="checkbox" name="HobbyOthers" value="Others"/>Others
       
        
        </td>
        </tr>
        <!-----------------------Qualification
       --------------------------------->
        <tr>
            <td>Qualification<br /><br /><b /></td>
            <td>
                <select id="Qualification" name="Qualification">
                    <option value="StateBoard(10th)">StateBoard(10th)</option>
                    <option value="StateBoard(12th)">StateBoard(12th)</option>
                    <option value="Graduation">Graduation</option>
                    <option value="PostGraduation">PostGraduation</option>
                    <option value="Phd">Phd</option>
                </select>
            </td>
        </tr>
        <!-----------------------Courses
       --------------------------------->
        <tr>
            <td>Courses<br />Applied For</td>
            <td>
                <select id="Courses" name="Courses">
                    <option value="CourseBCom">BCom</option>
                    <option value="CourseBSc">BSc</option>
                    <option value="CourseBA">BA</option>
                    <option value="CourseBCA">BCA</option>
                    <option value="CourseMCA">MCA</option>
                    <option value="CourseMCom">MCom</option>
                    <option value="CourseBCom">BCom</option>
                    <option value="CourseMSc">MSc</option>
                    <option value="CourseBSc">BSc</option>
                    <option value="CourseMA">MA</option>
                    <option value="CourseBA">BA</option>
                </select>
        </tr>
        <!----------------------- Submit and Reset ------------------------------->
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Submit">
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
    </form>
</body>
</html>