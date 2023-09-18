<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
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
  
</head>
<body>
  <div class="login-container">
    <div class="rounded p-4 bg-light text-center">
      <h1 class="mb-4">Login</h1>
      <img src="Manju1.png" alt="Login Image" class="square mb-3" style="width: 150px; height: 150px;">
      <form action="MyHttpServlet" method="POST">
      
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
          <input type="text" id="username" name="username" class="form-control" required>
        </div>
        <div class="mb-3">
          <label for="password">Password:</label>
          <input type="password" id="password" name="password" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
      </form>
      <p class="mt-3"><a href="forgotPassword.html">Forgot Password?</a></p>
      <p><a href="NewSignup.html">New Signup</a></p>
    </div>
   
</body>
</html>