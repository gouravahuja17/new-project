package techies.minor.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.Flight;
import techies.minor.operations.DaoClass;

public class FlightListServlet extends HttpServlet{

	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException , IOException{
		try {
		String from_city=request.getParameter("from_city");
		String to_city=request.getParameter("to_city");
		String dep_date=request.getParameter("dep_date");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
			java.util.Date dayDateUtil=sdf.parse(dep_date);
		
			java.sql.Date dayDateSql=new java.sql.Date(dayDateUtil.getTime());
			
		
		
		DaoClass dao=new DaoClass();
		List<Flight> flight=dao.findFlight(from_city, to_city, dayDateSql);
		
		
//		HttpSession session1=request.getSession(false);
//		System.out.println("session1");
		
		
			RequestDispatcher rd=request.getRequestDispatcher("FlightList.jsp");
			request.setAttribute("flight", flight);
			System.out.println("successfull");
			rd.forward(request, response);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
