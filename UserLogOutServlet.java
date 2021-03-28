package techies.minor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogOutServlet extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
		
		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			session.invalidate();
			System.out.println("user session destroyed successfully");
			PrintWriter write=response.getWriter();
			response.setContentType("text/html");
			write.println("<body><h1>You Have been Successfully Logged Out.</h1></body>");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
		
	}
}
