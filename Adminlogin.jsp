<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/adminlogin.css">
<title>Admin Log-In</title>
</head>
<body>
    <header>
        

        <div class="heading">
            <h2>Airline Reservation System</h2>
        </div>

        <div class="navigation">
            <ul>
              
                 <li><a href="index.jsp">Home</a></li>
                    <li><a href="flightSearch.jsp">Flight</a></li>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="#">Hi ! Guest</a></li>
                    <li><a href="signup.jsp" target="_blank">Sign-up</a>
                </li>
            </ul>
        </div>
       

</header>
    <div class="center">
        <div id="log">
    <form action="login" method="post" onsubmit="return SignInValid()">
     
        
       <div class="li">          
        <em><p>Login</p></em>
        <div class="ipt">
                    <label for="Name">NAME:</label> 
                      <input type="text"placeholder="Name" name="myFirstName" id="Name"><br>
                      <span id="myFirstName1" class="text-danger font-weight-bold"></span>
                      
                      
                       <label for="password">Password:</label>
                       <input type="password" placeholder="Password" name="myPassword" id="password"><br>
                       <span id="myPassword1" class="text-danger font-weight-bold"></span>
                       
                       
                       <label for="Name">Admin Id:</label>
                        <input type="text"placeholder="AdminId" name="adminid" id="adminid"><br>
                        <span id="adminid1" class="text-danger font-weight-bold"></span>
                    </div>
                        <div class="btn">
                        
                        <button>Log In</button> <button>Reset</button>
                    </div>
                    </div>

</div>
</form>
</div>
<footer>
    <h2>&copy; 2020-21 , All CopyRights Reserved</h2>
</footer>

<script src="static/js/adminsignin.js"></script>
</body>
</html>