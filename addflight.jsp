<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="static/css/addflight.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Add Flight</title>
</head>
<body>
  <div class="center">
        <div class="box">
            <h2>ADD_Flight</h2>
            <form action="flight" method="post">
                <div class="inputbox">
                    <input type="text" name="flightno" required>
                    <label>Flight_No</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="flightName" required>
                    <label>Flight_Name</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="fromCity" required>
                    <label>Flight_City</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="Tocity" required>
                    <label>To_City</label>
                </div>
                <div class="inputbox">
                    <input type="text" name="AirName" required>
                    <label>Airport_Name</label>
                </div>
                
                <div class="inputbox">
                    <input type="date" name="depDate" id="depDate" required>
                    <label>Dep_Date</label>
                </div>
               
                <div class="inputbox">
                    <input type="text" name="price" required>
                    <label>Price</label>
                </div>
                <input type="submit" name="submit" value="Save">
                <input type="reset" name="reset" value="Reset">




            </form>



        </div>
        
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
		 	$('#depDate').attr('min',maxDate);
		 
	 
 })
 
 })
 </script>
    
</body>
</html>