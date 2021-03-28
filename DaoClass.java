package techies.minor.operations;

import java.sql.Connection;





import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import techies.minor.javabeans.Flight;
import techies.minor.utility.DbOperations;

public class DaoClass {

	public List<Flight> findFlight(String from_city, String to_city, Date dep_date) {

		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		List<Flight> arrayList = new ArrayList<Flight>();
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		try {
			PreparedStatement ps = cnc
.prepareStatement("select * from tableflights where from_city=? and to_city=? and dep_date=?");
			ps.setString(1, from_city);
			ps.setString(2, to_city);
			ps.setDate(3, dep_date);

			long flight_no = 0;
			String flight_name = null;
			String airport_name = null;
			long price = 0;

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				flight_no = rs.getLong("flight_no");
				flight_name = rs.getString("flight_name");
				airport_name = rs.getString("airport_name");
				price = rs.getLong("price");

				arrayList.add(new Flight(flight_no, flight_name, from_city, to_city, dep_date, airport_name, price));
				System.out.println("List is found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("List is not found");
		} finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arrayList;
	}

	public Flight findFlightByFlight_No(long flight_no) {
		Flight flight = null;
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		try {
			PreparedStatement ps = cnc.prepareStatement("select * from tableflights where flight_no=?");
			ps.setLong(1, flight_no);

			String flight_name = null;
			String from_city = null;
			String to_city = null;
			String airport_name = null;
			long price = 0;
			Date dep_date = null;

			ResultSet set = ps.executeQuery();
			while (set.next()) {
				flight_name = set.getString("flight_name");
				from_city = set.getString("from_city");
				to_city = set.getString("to_city");
				airport_name = set.getString("airport_name");
				price = set.getLong("price");
				dep_date = set.getDate("dep_date");

				flight = new Flight(flight_no, flight_name, from_city, to_city, dep_date, airport_name, price);

				System.out.println("booking record found successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("booking record not found successfully");
		} finally {
			try {
				cnc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flight;

	}

	public int insertFlight(Flight flight) {
		int result = 0;
		try {
			DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");

			Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
			PreparedStatement ps = 
cnc.prepareStatement("Insert into tableflights(flight_no , flight_name , from_city , to_city ,dep_date , airport_name , price) values( ?, ? , ?,?,?,?,?)");

			ps.setLong(1, flight.getFlight_no());
			ps.setString(2, flight.getFlight_name());
			ps.setString(3, flight.getFrom_city());
			ps.setString(4, flight.getTo_city());
			ps.setDate(5, flight.getDep_date());
			ps.setString(6, flight.getAirport_name());
			ps.setLong(7, flight.getPrice());
			
			result = ps.executeUpdate();

			System.out.println("flight insertion successfull");
			cnc.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("flight insertion not successfull");
		}
		return result;

	}
	
	public List<Flight> findFlight(){
		List<Flight> arrayList = new ArrayList<>();
		try {
			DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");

			Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
			PreparedStatement ps=cnc.prepareStatement("select * from tableflights");
			
			ResultSet set = ps.executeQuery();
			
			long flight_no=0;
			String flight_name = null;
			String from_city = null;
			String to_city = null;
			String airport_name = null;
			long price = 0;
			Date dep_date = null;
			
			while(set.next()) {
				flight_no=set.getLong("flight_no");
				flight_name = set.getString("flight_name");
				from_city = set.getString("from_city");
				to_city = set.getString("to_city");
				airport_name = set.getString("airport_name");
				price = set.getLong("price");
				dep_date = set.getDate("dep_date");
				
				arrayList.add(new Flight(flight_no , flight_name , from_city , to_city ,dep_date , airport_name , price));
				
				System.out.println("flight selected successfully");
			
			}
		}catch (SQLException e) {
				
				e.printStackTrace();
				arrayList=new ArrayList();
				System.out.println("flight selected not successfully");
			}
			
			return arrayList;

	}
	
	public boolean deleteOperation(long flight_no) {
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		boolean rowDeleted=false;
		try {
			PreparedStatement ps = cnc.prepareStatement("delete from tableflights where flight_no=?");
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
	
	public boolean UpdateOperation(Flight flight) {
		DbOperations.loadDriver("com.mysql.cj.jdbc.Driver");
		Connection cnc = DbOperations.openConnection("jdbc:mysql://localhost:3306/dbflight", "root", "root");
		boolean updateStatus=false;
		try {
			
			PreparedStatement ps=cnc.prepareStatement("update tableflights set flight_name =?, from_city=? , to_city =?,dep_date =?, airport_name =?, price=? where flight_no=?");
			
			ps.setLong(7, flight.getFlight_no());
			ps.setString(1, flight.getFlight_name());
			ps.setString(2, flight.getFrom_city());
			ps.setString(3, flight.getTo_city());
			ps.setDate(4, flight.getDep_date());
			ps.setString(5, flight.getAirport_name());
			ps.setLong(6, flight.getPrice());
			
			updateStatus=ps.executeUpdate() >0;
			
			
			System.out.println("Update Operation Performed Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in Update Operation");
		}
		finally {
			try {
				cnc.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		
		return updateStatus;
		
	}
	
}