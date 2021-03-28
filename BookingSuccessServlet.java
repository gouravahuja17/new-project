package techies.minor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.BookedFlights;
import techies.minor.javabeans.Flight;
import techies.minor.javabeans.User;
import techies.minor.operations.BookedFlightOperation;

public class BookingSuccessServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		
		long price=Long.parseLong(request.getParameter("price"));
		int no_of_passengers=Integer.parseInt(request.getParameter("passengers"));
		request.setAttribute("no_of_passengers", no_of_passengers);
		
		HttpSession session=request.getSession(false);
		Flight flight=(Flight) session.getAttribute("flight_book");
		
		
	Flight flight_details=new Flight(flight.getFlight_no(),flight.getFlight_name(),flight.getFrom_city(),flight.getTo_city(),flight.getDep_date(),flight.getAirport_name(),price);
		

		
		
		RequestDispatcher rd=request.getRequestDispatcher("paymentdetails.jsp");
		session.setAttribute("flight_details", flight_details);
		rd.forward(request, response);
	}

	
}
