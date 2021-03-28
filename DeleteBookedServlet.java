package techies.minor.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.BookedFlights;
import techies.minor.javabeans.Flight;
import techies.minor.operations.BookedFlightOperation;
import techies.minor.operations.DaoClass;

public class DeleteBookedServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		long flight_no = Long.parseLong(req.getParameter("flight_no"));

		HttpSession session = req.getSession(false);
		BookedFlightOperation bookedflight = new BookedFlightOperation();

		boolean deleteOperation = bookedflight.deleteOperation(flight_no);
		if (deleteOperation) {

			List<BookedFlights> bookedflights = (List) session.getAttribute("bookedflights");

			for (Iterator<BookedFlights> iterator = bookedflights.iterator(); iterator.hasNext();) {
				if (iterator.next().getFlight_no() == flight_no)
					iterator.remove();
			}
			session.setAttribute("bookedflights", bookedflights);
			RequestDispatcher rd = req.getRequestDispatcher("viewbookedflight.jsp");
			rd.forward(req, res);
		} else {
			System.out.println("the operation cannot be performed");
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req, res);
		}

	}

}
