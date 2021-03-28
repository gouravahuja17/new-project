package techies.minor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import techies.minor.javabeans.Flight;
import techies.minor.operations.DaoClass;

public class AddFlightServlet extends HttpServlet{

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
		
		Flight flight=new Flight(flight_no,flight_name,from_city,to_city,dayDateSql,airport_name,price);
		DaoClass dao=new DaoClass();
		int result=dao.insertFlight(flight);
		
		if(result>0) {
			System.out.println("flight Insertion Successfull");
			PrintWriter write=response.getWriter();
			response.setContentType("text/html");
			write.println("<body><h1>Congratulations , The Flight has been successfully added</h1></body>");
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			rd.include(request, response);
		}
		else {
			System.out.println("flight insert not successfull");
		}}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

