<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="static/css/usersignup.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<title>Insert title here</title>
</head>
<body>

   
</head>
<body> <div class="center">
    <div class="container">
     <div class="row">
     <div class="col-md-10 offset=md-1">
         <div class="row">
             <div class="col-md-5 register-left">
                <img src="static/images/icon.jpg" alt="image not found">
             <h3>Hii!! User </h3>
             <p>Please Fill Your Details Here:-</p>
             </div>
             <div class="col-md-7 register-right">
                 <form action="userServlet" method="post" onsubmit="return SignUpValid()">
                <h2>User Sign-Up</h2>
                <div class="register-form">
                    <div class="form-group">
                        <input type="text" class="form-control" id="firstName" name="firstName"placeholder="First Name" required>
                        <span id="firstName1" class="text-danger font-weight-bold"></span>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="lastName" name="lastName"placeholder="Last Name" required>
                        <span id="lastName1" class="text-danger font-weight-bold"></span>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" id="contact"name="contact"placeholder="Phone Number" required>
                        <span id="contact1" class="text-danger font-weight-bold"></span>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control"id="address"name="address" placeholder="Address" required>
                        <span id="address1" class="text-danger font-weight-bold"></span>
                    </div>
                    
                    <div class="form-group">
                        <input type="email" name="email"class="form-control" id="email"placeholder="Email" required>
                        <span id="email1" class="text-danger font-weight-bold"></span>
                    </div>
                    <div class="form-group">
                        <input type="password" id="password"name="password"class="form-control" placeholder="Password" required>
                        <span id="password1" class="text-danger font-weight-bold"></span>
                    </div>
                    <div class="form-group">
                        <input type="password" id="re-password"name="re-password"class="form-control" placeholder="ReType Password" required>
                  		<span id="re-password1" class="text-danger font-weight-bold"></span>
                    </div>
                    <button type="reset" class="btn btn-primary">Reset</button>
                    <button type="submit" class="btn btn-primary">Sign-Up</button>
                </div>
             </div>
            </form>
         </div>
         </div>
         </div>
        </div>
    </div>

<script src="static/js/usersignup.js"></script>
</body>
</html>