<html>
<head>
  <title> Login Page </title>
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
       background-color:#A1EEBD;
       border:none;
       border-radius:4px;
    }
    
  
  .home{
  padding-top:50px;
  text-align:center;
  color:#008080;
  font-size:50px;
  }

    
   
  </style>
</head>

 <body>
 
 <div class="home">
   <span>${message}</span>
 </div>
 
 <br>

  
  
  <div class="container">
  <div class="login">
    <form class="form">
     <h2>LOG IN</h2>
     <input type="text" name="username" placeholder="Enter name">
     <input type="password" name="password" placeholder="Enter password">
     <input type="submit" value="login" formaction="LoginServlet" class="btn1">
     <input type="submit" value="signup" formaction="register.jsp" class="btn2">
    </form>
  </div>
 </div>
  
  
  
  
  
 </body>
</html>