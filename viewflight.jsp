<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="techies.minor.javabeans.Flight"  %>
    <%@page import ="java.util.List" %>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="static/css/viewflight.css">
<title>View Flight</title>
</head>
<body>
<center><h1>Displaying Flight Details</h1></center>
	<table id="table">
	<tr>
	<th><b>Flight_No  </b></th>
	<th><b>Flight_Name</b></th>
	<th><b>From City </b></th>
	<th><b>To City </b></th>
	<th><b>Dep_Date</b></th>
	<th><b>Airport_Name</b></th>
	<th><b>Price</b></th>

		
	</tr>
	
	<%List<Flight> FlightList=(ArrayList<Flight>)session.getAttribute("flightList");
	
	for(techies.minor.javabeans.Flight flight:FlightList){
	%>
	
	<tr>
	
	<td><b><%= flight.getFlight_no() %></b></td>
	<td><b> <%= flight.getFlight_name() %> </b></td>
	<td><b> <%= flight.getFrom_city() %> </b></td>
	<td><b> <%= flight.getTo_city() %> </b></td>
	<td><b><%= 	flight.getDep_date() %></b></td>
	<td><b><%= 	flight.getAirport_name() %></b></td>	
	<td><b><%= 	flight.getPrice() %></b></td>
	
	<td><a class="zoom" href='updateOperation?flight_no=<%= flight.getFlight_no() %>'>Modify</a></td>
	<td><a class="zoom" href='deleteOperation?flight_no=<%= flight.getFlight_no() %>'>Delete</a></td>

	
	</tr>
	
	
	<%} %>
	
	
	</table>
	
		<td><a class="zoom" href='adminhome.jsp'>Home Page</a></td>
</body>
</html>