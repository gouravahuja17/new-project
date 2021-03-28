package techies.minor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.User;
import techies.minor.operations.UserOperations;

public class UserLoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException{
		
		String name=request.getParameter("myFirstName");
		String password=request.getParameter("myPassword");
		long contact=Long.parseLong(request.getParameter("contact"));
		
		UserOperations userOp=new UserOperations();
		User user=userOp.findUserByContact(contact);
		
		
		if((null!=user) &&(name.equalsIgnoreCase(user.getFname())) && (password.equalsIgnoreCase(user.getPassword())) && (contact == user.getContact()) ) {
			System.out.println("user password and contact matches");
			HttpSession session=request.getSession(true);
			RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
			session.setAttribute("user", user);
			rd.forward(request, response);
		}
		else {
			
		System.out.println("User password contact do not match");
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		writer.println("<body><h2>Credentials do not match , Please login Again</body></h2>");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
	}
		
	}
}
