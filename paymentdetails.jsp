<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="techies.minor.javabeans.Flight"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.payment/3.0.0/jquery.payment.min.js"></script>
    <script src="static/js/payment.js"></script>
    <link rel="stylesheet" href="static/css/payment.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<title>Payment Details</title>
</head>
<body>
<%
		Flight flight = (Flight) session.getAttribute("flight_details");
		int no_of_passengers=(Integer) request.getAttribute("no_of_passengers");
	%>
	 <div class="center">
<div class="padding">
    <div class="row">
        <div class="container-fluid d-flex justify-content-center">
            <div class="col-sm-8 col-md-6">
                <div class="card">
                    <div class="card-header">
                        <div class="row">
                            <div class="col-md-6"> <span>CREDIT/DEBIT CARD PAYMENT</span> </div>
                            <div class="col-md-6 text-right" style="margin-top: -5px;"> <img src="https://img.icons8.com/color/36/000000/visa.png"> <img src="https://img.icons8.com/color/36/000000/mastercard.png"> <img src="https://img.icons8.com/color/36/000000/amex.png"> </div>
                        </div>
                    </div>
                    <form action="payment">
                    <div class="card-body" style="height: 350px">
                        <div class="form-group"> <label for="cc-number" class="control-label">CARD NUMBER</label> <input id="cc-number" type="tel" class="input-lg form-control cc-number" autocomplete="cc-number"required> </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group"> <label for="cc-exp" class="control-label">CARD EXPIRY</label> <input id="cc-exp" type="tel" class="input-lg form-control cc-exp" autocomplete="cc-exp"  required> </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group"> <label for="cc-cvc" class="control-label">CARD CVC</label> <input id="cc-cvc" type="tel" class="input-lg form-control cc-cvc" autocomplete="off"  required> </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group"> <label for="price" class="control-label">Price</label> <input id="price" name="price"type="tel" class="input-lg form-control cc-cvc" autocomplete="off" value=<%= flight.getPrice() %> readonly > </div>
                            </div>
                            <div class="col-md-6">
                             <div class="form-group"> <label for="passengers" class="control-label">No Of passengers</label> <input type="text" name="passengers" class="input-lg form-control" value=<%= no_of_passengers %> readonly> </div>
                       </div>
                        </div>
                        <div class="form-group"> <label for="numeric" class="control-label">CARD HOLDER NAME</label> <input type="text" class="input-lg form-control"> </div>
                        
                        <div class="form-group"> <input value="MAKE PAYMENT" type="submit" class="btn btn-success btn-lg form-control" style="font-size: .8rem;"> </div>
                       
                    </div>
                </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>