<html>
 <head>
 <title> Register Page </title>
  <style>
    input,h2{
    display:block;
    padding:10px;
    margin:10px;
    width:40%;
    }
    
    .login{
     display:block;
     align-items:center;
     justify-content:center;
     height:100vh;
     margin:0;
     
    }
    
    .form{
       padding:50px;
       padding-left:510px;
    }
    
    body{
    text-align:center;
    }
    
    .btn2,.btn1{
       color:black;
       background-color:#DC84F3;
       border:none;
       border-radius:4px;
    }
   
    
  </style>
 </head>
 <body>
 <div class="container">
  <div class="login">
    <form class="form">
     <h2>CREATE ACCOUNT</h2>
     <input type="text" name="username" placeholder="Enter name">
     <input type="password" name="password" placeholder="Enter password">
     <input type="number" name="mobno" placeholder="Enter mobile no">
     <input type="email" name="emailid" placeholder="Enter emailid">
     <input type="submit" value="register" formaction="RegistrationServlet" class="btn2">
     <input type="submit" value="login" formaction="login.jsp" class="btn2">
    </form>
  </div>
 </div>
 </body>
</html>