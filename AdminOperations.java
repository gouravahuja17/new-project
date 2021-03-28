package techies.minor.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import techies.minor.javabeans.Admin;
import techies.minor.javabeans.User;
import techies.minor.utility.DbOperations;

public class AdminOperations {
	public int insert(Admin admin) {
		int result = 0;
		try {
			DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");

			Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
			PreparedStatement ps = cnc.prepareStatement("Insert into admintable(firstname ,lastname,adminid,contact, address,email,password,re_password) values( ?, ? ,?, ?,?,?,?,?)");
			
			ps.setString(1, admin.getFirstname());
			ps.setString(2, admin.getLastname());
			ps.setInt(3, admin.getAdminid());
			ps.setLong(4, admin.getContact());
			ps.setString(5, admin.getAddress());
			ps.setString(6, admin.getEmail());
			ps.setString(7, admin.getPassword());
			ps.setString(8, admin.getRe_password());

			result=ps.executeUpdate();
			System.out.println("admin insertion successfull");

			cnc.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("admin insertion not successfull");
		}
		return result;

	}
	
	
	public Admin findAdminByAdminid(int adminid) {
		Admin admin=null;
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");

		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		
		try {
			PreparedStatement ps=cnc.prepareStatement("select * from admintable where adminid=?");
			ps.setInt(1, adminid);
			
			String firstname=null;
			String lastname=null;
			long contact=0;
			String address=null;
			String email=null;
			String password=null;
			String re_password=null;
			String active_status=null;
			
			ResultSet set=ps.executeQuery();
			
			if(set.next()) {
				
				firstname=set.getString("firstname");
				lastname=set.getString("lastname");
				contact=set.getLong("contact");
				address=set.getString("address");
				email=set.getString("email");
				password=set.getString("password");
				re_password=set.getString("re_password");
				active_status=set.getString("active_status");
				
				
admin=new Admin(firstname , lastname, adminid, contact , address, email , password , re_password , active_status);
System.out.println("admin selection successfull");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("admin selection not successfull");
		}
		finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return admin;
		
	}
}
