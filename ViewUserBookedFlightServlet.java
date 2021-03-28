package techies.minor.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.BookedFlights;
import techies.minor.operations.BookedFlightOperation;

public class ViewUserBookedFlightServlet extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
		
		
		BookedFlightOperation bookedflight=new BookedFlightOperation();
		List<BookedFlights> arrayList=bookedflight.findBookedFlights();
		HttpSession session=request.getSession();
		
		RequestDispatcher rd=request.getRequestDispatcher("viewbookedflight.jsp");
		session.setAttribute("bookedflights",  arrayList);
		rd.forward(request, response);
	}
}
