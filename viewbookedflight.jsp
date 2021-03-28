<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="techies.minor.javabeans.BookedFlights"  %>
    <%@page import ="java.util.List" %>
    <%@page import="java.util.ArrayList"%>
    <%@page import="java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="static/css/viewflight.css">
<title>Booked Flight</title>
</head>
<body>
 
<center><h1>Displaying Booked Flights</h1></center>
	<table id="table">
	<tr>
	<th><b>Username</b></th>
	<th><b>Flight_No  </b></th>
	<th><b>Airport_Name</b></th>
	<th><b>Price</b></th>
	<th><b>Dep_Date</b></th>
	<th><b>No Of Passengers</b></th>
	<th><b>Flight_Name</b></th>
	<th><b>From City </b></th>
	<th><b>To City </b></th>

		
	</tr>
	
	<%List<BookedFlights> BookedFlight=(ArrayList<BookedFlights>)session.getAttribute("bookedflights");
	if(BookedFlight.isEmpty()){
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<body><h1>Sorry , You haven't booked any FLights. </h1></body>");
		write.println("<body><h1>Please  Book a Flight</h1></body>");
		write.println("<body><h2><a href='flightSearch.jsp'>Click here to Book</a></h2></body>");
	} else{
	for(techies.minor.javabeans.BookedFlights flight:BookedFlight){
	%>
	
	<tr>
	
	<td><b><%= flight.getUsername() %></b></td>
	<td><b><%= flight.getFlight_no() %></b></td>
	
	
	<td><b><%= 	flight.getAirport_name() %></b></td>	
	<td><b><%= 	flight.getPrice() %></b></td>
	<td><b><%= 	flight.getDep_date() %></b></td>
	<td><b><%= flight.getNo_of_passengers() %></b></td>
	<td><b> <%= flight.getFlight_name() %> </b></td>
	<td><b> <%= flight.getFrom_city() %> </b></td>
	<td><b> <%= flight.getTo_city() %> </b></td>
	
	<td><a class="zoom" href='deleteOperations?flight_no=<%= flight.getFlight_no() %>'>Delete</a></td>

	
	</tr>
	
	
	<%} 
	}%>
	<a class="zoom" href='userhome.jsp'><- Go Back</a>
	</table>
</body>
</html>