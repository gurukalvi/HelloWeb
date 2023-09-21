<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
 <!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <style type="text/css" >
     body {
			background-image: url('mrk.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
        
        }
        
        .error-message {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
        
    .login-container {

      width: 80%;
      height: 75vh;
      display: flex;
      justify-content: right;
      align-items: center;
      
    }
  </style>
  
  <title>Login</title>
  <style>
h1 {
  text-shadow: 2px 2px;
}
</style>
<script type="text/javascript">

	$(document).ready(function(){

	  	$("#loginButton").click(function(){
	  	        $("#usernameError").html("");
				$("#passwordError").html("");
		  	    
		  	   var usernameValue = $("#usernameId").val();
		  	 var passwordValue = $("#passwordId").val();
		  	console.log("Username Value = "+usernameValue);
			console.log("Password Value = "+passwordValue);
			if(usernameValue.length <= 3 || passwordValue.length < 5){
				if(usernameValue.length <= 3){
					$("#usernameError").html("userName should be more than 3 characters");
				}
				if(passwordValue.length < 5){
					$("#passwordError").html("Password should be more than 6 characters");
				}
			}
			else{
				$("#loginForm").submit();
			}
	    });
	});

<!--
function showWindow(){
	//alert("onload function");
	console.log("Inside the showWindow javascript method");
	document.getElementById("usernameError").innerHTML = "";
	document.getElementById("passwordError").innerHTML = "";
	var usernameValue = document.getElementById("usernameId").value;
	var passwordValue = document.getElementById("passwordId").value;
	console.log("Username Value = "+usernameValue);
	console.log("Password Value = "+passwordValue);
	if(usernameValue.length <= 3 || passwordValue.length < 5){
		if(usernameValue.length <= 3){
			//alert("userName should be more than 3 characters");
			document.getElementById("usernameError").innerHTML = "userName should be more than 3 characters";
		}
		if(passwordValue.length < 5){
			//alert("Password should be more than 6 characters");
			document.getElementById("passwordError").innerHTML = "Password should be more than 6 characters";
		}
	}
	else{
		document.getElementById("loginForm").submit();
	}
	
	
	
	
}
-->
</script>
  
</head>
<body>
  <div class="login-container">
    <div class="rounded p-4 bg-light text-center">
      <h1 class="mb-4">Login</h1>
      <img src="Manju1.png" alt="Login Image" class="square mb-3" style="width: 150px; height: 150px;">
      <form id="loginForm" action="MyHttpServlet" method="POST">
      
        <div class="error-message">
             
                <!-- Display login error messages here -->
               <%
               	
               	String errorMsg = (String)session.getAttribute("errorMessage");
             
               	if(errorMsg != null){
               %>
                
                <%= session.getAttribute("errorMessage") %>
              
                <%
               	}
                %>
  		</div>
        <div class="mb-3">
          <label for="username">Username:</label>
          <input type="text" id="usernameId" name="username" class="form-control">
          <div id="usernameError" style="color: red;" ></div>
        </div>
        <div class="mb-3">
          <label for="password">Password:</label>
          <input type="password" id="passwordId" name="password" class="form-control" ><br>
          <div id="passwordError" style="color: red;" ></div>
        </div>
        <button id="loginButton" type="button" class="btn btn-primary" >Login</button>
      </form>
      <p id="forgetPwd" class="mt-3"><a href="forgotPassword.html">Forgot Password?</a></p>
      <p><a href="NewSignup.html">New Signup</a></p>
    </div>
   
</body>
</html>