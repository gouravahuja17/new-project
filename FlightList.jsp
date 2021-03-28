<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
    <%@ page import="techies.minor.javabeans.Flight"  %>
    <%@page import ="java.util.List" %>
    <%@page import="java.util.ArrayList"%>
   <%@page import="java.io.PrintWriter" %>
<%@ page session="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="static/css/flighlist.css">
<title>Flight-List</title>
</head>
<body>

	
	<% System.out.println("Flight List Session "+request.getSession()); %>
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
	<th><b>Book</b></th>
	
	
	
	</tr>
	
	<%List<techies.minor.javabeans.Flight> FlightList=(ArrayList<techies.minor.javabeans.Flight>)request.getAttribute("flight");
	
	if(FlightList.isEmpty()){
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<body><h1>Sorry There are no Flights Available as per your search </h1></body>");
		write.println("<body><h1>Please Search Again</h1></body>");
		write.println("<body><h2><a href='flightSearch.jsp'>Click here to Search Again</a></h2></body>");
	} else{
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
			
			<td><b><a class="zoom"href='book?flight_no=<%= flight.getFlight_no() %>'>Book</a></b></td>
			
			</tr>
			
			
			<%}
	 }
	 %>
	</table>
	
	
</body>
</html>