package techies.minor.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.Flight;
import techies.minor.operations.DaoClass;

public class ViewFlight extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		
		List<Flight> flightList=new ArrayList();
		DaoClass dao=new DaoClass();
		flightList=dao.findFlight();
		
		HttpSession session=request.getSession(true);
		session.setAttribute("flightList",flightList);
		if(flightList == null) {
			
			RequestDispatcher rd = request.getRequestDispatcher("ViewFlightError.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("viewflight.jsp");
			rd.forward(request, response);
		}
	}
	

}
