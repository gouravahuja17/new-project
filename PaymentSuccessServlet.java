package techies.minor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

public class PaymentSuccessServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long price = Long.parseLong(request.getParameter("price"));
		int no_of_passengers = Integer.parseInt(request.getParameter("passengers"));

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Flight flight = (Flight) session.getAttribute("flight_book");

		BookedFlights bookedflight = new BookedFlights(user.getFname(), flight.getFlight_no(), flight.getAirport_name(),
				price, flight.getDep_date(), no_of_passengers, flight.getFlight_name(),
				flight.getFrom_city(), flight.getTo_city());
		BookedFlightOperation bookedflightoperation = new BookedFlightOperation();

		int result = bookedflightoperation.insert(bookedflight);

		if (result > 0) {
			System.out.println("user booking successfull");
		} else {
			System.out.println("user booking not successfull");
		}
		PrintWriter write=response.getWriter();
		response.setContentType("text/html");
		write.println("<body><h1>You Flight has been successfully booked</h1></body>");
		RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
		session.setAttribute("bookedflight", bookedflight);
		rd.include(request, response);

	}
}
