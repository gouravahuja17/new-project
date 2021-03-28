package techies.minor.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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

public class UpdateServlet2 extends HttpServlet {

	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{

		
		try {
			int flight_no=Integer.parseInt(request.getParameter("flightno"));
			String flight_name = request.getParameter("flightName");
			String from_city = request.getParameter("fromCity");
			String to_city = request.getParameter("Tocity"); 
			String dep_date= request.getParameter("depDate");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			
			java.util.Date dayDateUtil=null;
			
				dayDateUtil = sdf.parse(dep_date);
			

		
			java.sql.Date dayDateSql=new java.sql.Date(dayDateUtil.getTime());
			
			String airport_name = request.getParameter("AirName"); 
			
			long price=Long.parseLong( request.getParameter("price"));
			
			Flight updateUser=new Flight(flight_no,flight_name,from_city,to_city,dayDateSql,airport_name,price);
			DaoClass dao=new DaoClass();
			
			boolean updateStatus=dao.UpdateOperation(updateUser);
			
			HttpSession session=request.getSession(false);
			List<Flight> flightList=(List) session.getAttribute("flightList");
			
			if(updateStatus) {
				for(Iterator<Flight> iterator = flightList.iterator(); iterator.hasNext(); ) {
				    if(iterator.next().getFlight_no() == flight_no)
				        iterator.remove(); 
				    	break;
				}
				flightList.add(updateUser);
				
				session.setAttribute("flightList", flightList);
				RequestDispatcher rd = request.getRequestDispatcher("viewflight.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}}catch(ParseException e) {
				e.printStackTrace();
		}

			

	}

}
