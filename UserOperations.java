package techies.minor.operations;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import techies.minor.javabeans.User;
import techies.minor.utility.DbOperations;

public class UserOperations {

	public int insert(User user) {
		int result = 0;
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		try {
			

			
			PreparedStatement ps = cnc.prepareStatement("Insert into usertable(fname ,lname,contact, address,email,password,re_password) values( ?, ? , ?,?,?,?,?)");

			ps.setString(1, user.getFname());
			ps.setString(2, user.getLname());
			ps.setLong(3, user.getContact());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getEmail());
			ps.setString(6,user.getPassword());
			ps.setString(7,user.getRe_password());

			result=ps.executeUpdate();
			System.out.println("user insertion successfull");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("user insertion not successfull");
		}
		finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;

	}
	
	public User findUserByContact(long contact) {
		User user=new User();
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc=DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		try {
			PreparedStatement ps=cnc.prepareStatement("select * from usertable where contact=?");
			ps.setLong(1, contact);
			
			int id=0;
			String fname=null;
			String lname=null;
			String address=null; 
			String email=null;
			String password=null ;
			String re_password=null;
			
			
			ResultSet set=ps.executeQuery();
			if(set.next()) {
				id=set.getInt("id");
				fname=set.getString("fname");
				lname=set.getString("lname");
				address=set.getString("address");
				email=set.getString("email");
				password=set.getString("password");
				re_password=set.getString("re_password");
				
				user=new User(fname,lname,contact,address,email,password,re_password);
				System.out.println("user selection successfull");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("user selection not successfull");
		}finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
		
	}

}
