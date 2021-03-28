<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="techies.minor.javabeans.Flight"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
 <link rel="stylesheet" href="static/css/booking.css">
<title>Booking Page</title>
</head>
<body>
	<%
		Flight flight = (Flight) session.getAttribute("flight_book");
	%>
	<div class="center">
    <div class="col-md-7 register-right">
    <div class="register-form">
	<form action="booking">
	<div class="form-group">
		Flight No: <input type="text" value=<%=flight.getFlight_no()%> readonly><br>
		</div>
		<div class="form-group">
		Flight Name: <input type="text" value=<%=flight.getFlight_name()%> readonly><br>
		</div>
		<div class="form-group">
		From : <input type="text" value=<%=flight.getFrom_city()%> readonly><br>
		</div>
		<div class="form-group">
		City : <input type="text" value=<%=flight.getTo_city()%> readonly><br>
		</div>
		<div class="form-group">
		Airport Name :<input type="text" value=<%=flight.getAirport_name()%> readonly><br>
		</div>
	<div class="form-group">
		No Of Passengers : <select name="passengers" id="passenger" onchange="priceCalculation(this)">
			<option value=1>1</option>
			<option value=2>2</option>
			<option value=3>3</option>
			<option value=4>4</option>
			<option value=5>5</option>
		</select> <br> </div>
		<div class="form-group">
		Price : <input type="text" id="price" name="price" value=<%=flight.getPrice()%> readonly><br>
		</div>
		<div class="form-group">
		 <input type="hidden" id="priceHidden" name="priceHidden" value=<%=flight.getPrice()%> readonly><br>
	</div>	<button class="btn btn-primary" input type="submit">Confirm</button>
	</form>
	

	</div>
	</div>
	</div>
	<script type="text/javascript" src="static/js/booking.js">
	
	</script>
</body>
</html>