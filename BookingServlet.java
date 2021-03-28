package techies.minor.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.Flight;
import techies.minor.javabeans.User;
import techies.minor.operations.DaoClass;

public class BookingServlet extends HttpServlet {

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
		HttpSession session=request.getSession(false);
		User user=(User) session.getAttribute("user");
		
		if(user!=null) {
			long flight_no=Long.parseLong(request.getParameter("flight_no"));
			
			DaoClass dao=new DaoClass();
			Flight flight=dao.findFlightByFlight_No(flight_no);
			RequestDispatcher rd=request.getRequestDispatcher("booking.jsp");
			session.setAttribute("flight_book", flight);
			rd.forward(request, response);
		}
		else {
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			
			writer.println("<body><h1>Please Login First</h1></body>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		
			rd.include(request, response);
			
		}
		
	}
}
