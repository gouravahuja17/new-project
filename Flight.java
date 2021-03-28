package techies.minor.javabeans;

import java.sql.Date;

public class Flight {

	private long flight_no;
	private String flight_name;
	private String from_city;
	private String to_city;
	private Date dep_date;
	private String airport_name;
	private long price;
	
	
	
	
	public Flight() {
		super();
	}
	
	
	public Flight(long flight_no, String flight_name, String from_city, String to_city, Date dep_date,
			String airport_name, long price) {
		super();
		this.flight_no = flight_no;
		this.flight_name = flight_name;
		this.from_city = from_city;
		this.to_city = to_city;
		this.dep_date = dep_date;
		this.airport_name = airport_name;
		this.price = price;
	}
	public long getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(long flight_no) {
		this.flight_no = flight_no;
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
	public Date getDep_date() {
		return dep_date;
	}
	public void setDep_date(Date dep_date) {
		this.dep_date = dep_date;
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


	@Override
	public String toString() {
		return "flight [flight_no=" + flight_no + ", flight_name=" + flight_name + ", from_city=" + from_city
				+ ", to_city=" + to_city + ", dep_date=" + dep_date + ", airport_name=" + airport_name + ", price="
				+ price + "]";
	}
	
	
	
}


















