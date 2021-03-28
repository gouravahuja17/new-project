package techies.minor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import techies.minor.javabeans.Flight;
import techies.minor.operations.DaoClass;


public class UpdateServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException
	{
		long flight_no=Long.parseLong(request.getParameter("flight_no"));
		
		DaoClass dao=new DaoClass();
		
		Flight existingUser=dao.findFlightByFlight_No(flight_no);
		request.setAttribute("existUser", existingUser);
		RequestDispatcher rd=request.getRequestDispatcher("edit-form.jsp");
		
		rd.forward(request, response);
		
	}

}
