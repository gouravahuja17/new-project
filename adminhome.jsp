<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="techies.minor.javabeans.Admin"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="static/css/adminhome.css">
<title>Home - Admin</title>
</head>
<body>
<%Admin admin=(Admin) session.getAttribute("admin"); %>
<header>
        

            <div class="heading">
                <h2>Airline Reservation System</h2>
            </div>
    
            <div class="navigation">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="addflight.jsp">Add Flight</a></li>
                    <li><a href="viewFlights">View Flights</a></li>
                    <li><a href="#">Hi ! <%= admin.getFirstname() %></a></li>
                    <li><a href="logout1">Log out</a>
                    </li>
                </ul>
            </div>
           
    
    </header>

  	<div id="center">
  	<h1>Welcome to</h1>
  	<h1>Online Air Reservation System</h1>
  	</div>

    <footer>
        <h2>&copy; 2020-21 , All CopyRights Reserved</h2>
    </footer>

</body>
</html>