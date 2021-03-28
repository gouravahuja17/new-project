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

import techies.minor.javabeans.Flight;
import techies.minor.operations.DaoClass;

public class CancelBookingServlet extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException{
		long flight_no=Long.parseLong(request.getParameter("flight_no"));
		
DaoClass dao= new DaoClass();
		
		
		
		HttpSession session=request.getSession(false);
		
		boolean deleteOperation=dao.deleteOperation(flight_no);
		if(deleteOperation) {
			
			List<Flight> flightList=(List) session.getAttribute("flightList");

			for(Iterator<Flight> iterator = flightList.iterator(); iterator.hasNext(); ) {
			    if(iterator.next().getFlight_no() == flight_no)
			        iterator.remove(); 
			}
			session.setAttribute("flightList",flightList);
			RequestDispatcher rd = request.getRequestDispatcher("viewflight.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("the operation cannot be performed");
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

	
	
	
}
