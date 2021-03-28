<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/adminsignup.css">
<title>Admin Page</title>
</head>
<body>
	<div class="center">
			<form action="adminServlet" method="post"onsubmit=" return SignUpValid()">  
				<div class="container">
					<center>
						<h1>SIGNUP-ADMIN</h1>
					</center>
					<hr>
					<label> Firstname: </label> &nbsp; &nbsp; &nbsp; <input type="text"
						name="firstname" id="firstName" placeholder="Firstname" required /> <br>
						<span id="firstName1" class="text-danger font-weight-bold"></span>
						 
						 <label> Lastname: </label> &nbsp; &nbsp; &nbsp; 
			<input type="text" name="lastname" placeholder="Lastname" id="lastName"required /> <br>
						  <span id="lastName1" class="text-danger font-weight-bold"></span>
						  
						  <label> Admin ID: </label> &nbsp; &nbsp; &nbsp; 
			<input type="number" name="adminID"id="adminid" placeholder="Admin ID" required /> <br> 
					<span id="adminid1" class="text-danger font-weight-bold"></span>	
						
						<label>
						Phone : </label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="text"
						name="contact" id="contact" placeholder="Country Code" value="+91"
						size="2" /> <input type="text" name="phone"
						placeholder="phone no." size="10" required> <br>
						<span id="contact1" class="text-danger font-weight-bold"></span>
						
					Current Address :
					<textarea cols="52" rows="5" placeholder="Current Address"
						value="address" id="address" required name="address">  
</textarea>
					<br> 
					 <span id="address1" class="text-danger font-weight-bold"></span>
					
					<label for="email"><b>Email :</b></label> &nbsp; &nbsp;
					&nbsp; &nbsp; &nbsp; &nbsp; <input type="text"
						placeholder="Enter Email" name="email"id="email" size=25 required><br>
						  <span id="email1" class="text-danger font-weight-bold"></span>
						

					<label for="psw"><b>Password :</b></label> &nbsp; &nbsp; &nbsp; <input
						type="password" id="password" placeholder="Enter Password" name="psw" size=25
						required> <br>
						<span id="password1" class="text-danger font-weight-bold"></span>
						
						 <label for="psw-repeat"><b>Re-type
							Password :</b></label> <input type="password" id="re-password" placeholder="Retype Password"
						name="psw-repeat" size="25" required>
						<span id="re-password1" class="text-danger font-weight-bold"></span>
						
					<button type="submit" class="registerbtn">SIGNUP</button>
					<br>
					<button type="reset" class="registerbtn">RESET</button>
			</form>
	</div>
<script src="static/js/adminsignup.js"></script>
</body>
</html>