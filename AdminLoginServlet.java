package techies.minor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.Admin;
import techies.minor.javabeans.User;
import techies.minor.operations.AdminOperations;

public class AdminLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException{
	
		String name=request.getParameter("myFirstName");
		String password=request.getParameter("myPassword");
		int adminid=Integer.parseInt(request.getParameter("adminid"));
	
		AdminOperations adminOp=new AdminOperations();
		Admin admin=adminOp.findAdminByAdminid(adminid);
		
		
		if((null!=admin) &&(name.equals(admin.getFirstname())) && (password.equals(admin.getPassword())) && (adminid==admin.getAdminid()) ){
			System.out.println("admin password and contact matches");
			HttpSession session=request.getSession(true);
			RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
			session.setAttribute("admin", admin);
			rd.forward(request, response);
		}
		
		else {
			System.out.println("admin password contact do not match");
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			
			writer.println("<body><h2>Credentials do not match , Please login Again</body></h2>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}
	
}
