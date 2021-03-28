package techies.minor.operations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import techies.minor.javabeans.BookedFlights;
import techies.minor.javabeans.Flight;
import techies.minor.utility.DbOperations;

public class BookedFlightOperation {

	public int insert(BookedFlights bookedflight) {
		int result = 0;
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		try {
			

			
			PreparedStatement ps = cnc.prepareStatement("Insert into bookedflights(username ,flight_no,airport_name, Price,dep_date,no_of_passengers,flight_name,from_city,to_city) values( ?, ? ,?, ?,?,?,?,?,?)");

			ps.setString(1, bookedflight.getUsername());
			ps.setLong(2, bookedflight.getFlight_no());
			ps.setString(3, bookedflight.getAirport_name());
			ps.setLong(4, bookedflight.getPrice());
			ps.setDate(5, bookedflight.getDep_date());
			ps.setInt(6, bookedflight.getNo_of_passengers());
			ps.setString(7, bookedflight.getFlight_name());
			ps.setString(8, bookedflight.getFrom_city());
			ps.setString(9, bookedflight.getTo_city());
			

			result=ps.executeUpdate();
			System.out.println("user booked flight insertion successfull");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("user booked flight insertion not successfull");
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
	
	public List<BookedFlights> findBookedFlights(){
		List<BookedFlights> arrayList = new ArrayList<>();
		try {
			DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");

			Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
			PreparedStatement ps=cnc.prepareStatement("select * from bookedflights");
			
			ResultSet set = ps.executeQuery();
			
			String username=null;
			long flight_no=0;
			String airport_name = null;
			long price = 0;
			Date dep_date = null;
			int no_of_passengers=0;
			String flight_name = null;
			String from_city = null;
			String to_city = null;
			
			
			
			while(set.next()) {
				username=set.getString("username");
				flight_no=set.getLong("flight_no");
				
				airport_name = set.getString("airport_name");
				price = set.getLong("price");
				dep_date = set.getDate("dep_date");
				no_of_passengers=set.getInt("no_of_passengers");
				flight_name = set.getString("flight_name");
				from_city = set.getString("from_city");
				to_city = set.getString("to_city");
				
				arrayList.add(new BookedFlights(username , flight_no , airport_name, price , dep_date , no_of_passengers , flight_name , from_city , to_city ));
				
				System.out.println("booked flight selected successfully");
			
			}
		}catch (SQLException e) {
				
				e.printStackTrace();
				arrayList=new ArrayList();
				System.out.println("booked flight selected not successfully");
			}
			
			return arrayList;

	}
	
	public boolean deleteOperation(long flight_no) {
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		boolean rowDeleted=false;
		try {
			PreparedStatement ps = cnc.prepareStatement("delete from bookedflights where flight_no=?");
			ps.setLong(1, flight_no);
			
			rowDeleted=ps.executeUpdate() >0;
			System.out.println("deleted operation performed successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error in executing delete operation");
		}finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowDeleted;
	}

	
}
