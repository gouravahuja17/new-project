package techies.minor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.User;
import techies.minor.operations.UserOperations;

public class UserServlet extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
		
		String fName=req.getParameter("firstName");
		String lName=req.getParameter("lastName");
		long contact=Long.parseLong(req.getParameter("contact"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String re_password=req.getParameter("re-password");
		
		UserOperations userOp=new UserOperations();
		
		User user=new User(fName,lName,contact,address,email,password,re_password);
		int result=userOp.insert(user);
		
		if(result>0) {
			System.out.println("user insertion successfull");
		}
		else {
			System.out.println("user insertion not successfull");
		}
		
		HttpSession session=req.getSession(true);
		session.setAttribute("user", user);
		RequestDispatcher rd=req.getRequestDispatcher("userhome.jsp");
		rd.forward(req, res);
	}
	
}
