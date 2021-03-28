<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="techies.minor.servlet.UpdateServlet" %>
     <%@page import="techies.minor.javabeans.Flight" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="static/css/addflight.css">
<title>Edit-Form</title>
</head>
<body>
<% Flight  flight=(Flight) request.getAttribute("existUser") ;%>
 <div class="center">
        <div class="box">
            <h2>UPDATE_Flight</h2>
            <form action="updateServlet2" method="post">
                <div class="inputbox">
                    <input type="hidden" name="flightno" required value=<%= flight.getFlight_no() %>>
                </div>
                <div class="inputbox">
                    <input type="text" name="flightName" required value=<%= flight.getFlight_name() %>>
                    <label>Flight_Name</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="fromCity" required value=<%= flight.getFrom_city() %>>
                    <label>Flight_City</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="Tocity" required value=<%= flight.getFrom_city() %>>
                    <label>To_City</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="AirName" required value=<%= flight.getAirport_name() %>>
                    <label>Airport_Name</label>
                </div>
                
                <div class="inputbox">
                    <input type="date" name="depDate" required value=<%= flight.getDep_date()  %>>
                    <label>Dep_Date</label>
                </div>
               
                <div class="inputbox">
                    <input type="text" name="price" required value=<%= flight.getPrice() %>>
                    <label>Price</label>
                </div>
                <input type="submit" name="submit" value="Save">
                <input type="reset" name="reset" value="Reset">




            </form>



        </div>
    
</body>
</html>