<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="techies.minor.javabeans.User"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/userflightSearch.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Book Flights</title>
</head>
<body>
<% User user=(User) session.getAttribute("user"); %>
 <header>
  <div class="heading">
                <h2>Airline Reservation System</h2>
            </div>
    
            <div class="navigation">
                <ul>
                     <li><a href="userhome.jsp">Home</a></li>
                    <li><a href="flightSearch.jsp">Book Flight</a></li>
                    <li><a href="viewBook">View Booked Flights</a></li>
                    <li><a href="#">Hi ! <%= user.getFname() %> </a></li>
                    <li><a href="logout">Log Out</a>
                    </li>
                </ul>
            </div>
            </header>
	<center><h1>Search Flight</h1></center>
	 <div class="center">
        <div class="col-md-7 register-right">
        <div class="register-form">
	<form action="userSearch">
	<div class="form-group">
		Flight From: <input type="text" name="from_city">
		</div>
		<div class="form-group">
		Flight To: <input type="text" name="to_city">
		</div>
		<div class="form-group">
		Date of Departure <input type="date" name="dep_date" id="date">
		</div>
		
		<input type="submit" value="submit">
	</form>
	</div>
	</div>
	</div>
	 <footer>
        <h2>&copy; 2020-21 , All CopyRights Reserved</h2>
    </footer>
    <script type="text/javascript">
 $(document).ready(function(){
	 $(function(){
		 var dtToday=new Date();
		 
		 var month=dtToday.getMonth()+1;
		 var day=dtToday.getDate();
		 var year=dtToday.getFullYear();
		 
		 if(month<10)
			month='0'+month.toString();
		 	if(day<10)
		 		day='0'+day.toString();
		 	
		 	var maxDate=year+'-'+month+'-'+day;
		 	$('#date').attr('min',maxDate);
		 
	 
 })
 
 })
 </script>
</body>
</html>