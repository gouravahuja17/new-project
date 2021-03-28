package techies.minor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import techies.minor.javabeans.Admin;
import techies.minor.operations.AdminOperations;

public class AdminServlet extends HttpServlet{

		public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
			
			String fName=req.getParameter("firstname");
			String lName=req.getParameter("lastname");
			int admin_id=Integer.parseInt(req.getParameter("adminID"));
			long contact=Long.parseLong(req.getParameter("contact"));
			String address=req.getParameter("address");
			String email=req.getParameter("email");
			String password=req.getParameter("psw");
			String re_password=req.getParameter("psw-repeat");
			
			Admin admin=new Admin(fName,lName,admin_id,contact,address,email,password,re_password);
			AdminOperations adminOp=new AdminOperations();
			
			int result=adminOp.insert(admin);
			if(result>0) {
				System.out.println("admin insertion successfull");
			}
			else {
				System.out.println("admin insertion not successfull");
			}
			
			HttpSession session=req.getSession(true);
			session.setAttribute("admin", admin);
			RequestDispatcher rd=req.getRequestDispatcher("adminhome.jsp");
			rd.forward(req, res);
}
}
