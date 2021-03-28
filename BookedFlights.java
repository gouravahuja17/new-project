package techies.minor.javabeans;

import java.sql.Date;

public class BookedFlights {

	private String username;
	private long flight_no;
	private String airport_name;
	private long price;
	private Date dep_date;
	private int no_of_passengers;
	private String flight_name;
	private String from_city;
	private String to_city;
	
	
	
	public BookedFlights() {
		super();
	}
	public BookedFlights(String username, long flight_no, String airport_name, long price, Date dep_date,
			int no_of_passengers, String flight_name, String from_city, String to_city) {
		super();
		this.username = username;
		this.flight_no = flight_no;
		this.airport_name = airport_name;
		this.price = price;
		this.dep_date = dep_date;
		this.no_of_passengers = no_of_passengers;
		this.flight_name = flight_name;
		this.from_city = from_city;
		this.to_city = to_city;
	}
	@Override
	public String toString() {
		return "BookedFlights [username=" + username + ", flight_no=" + flight_no + ", airport_name=" + airport_name
				+ ", price=" + price + ", dep_date=" + dep_date + ", no_of_passengers=" + no_of_passengers
				+ ", flight_name=" + flight_name + ", from_city=" + from_city + ", to_city=" + to_city + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(long flight_no) {
		this.flight_no = flight_no;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Date getDep_date() {
		return dep_date;
	}
	public void setDep_date(Date dep_date) {
		this.dep_date = dep_date;
	}
	public int getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}
	public String getTo_city() {
		return to_city;
	}
	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}
	
	
}
