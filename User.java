package techies.minor.javabeans;

import java.util.Arrays;

public class User {

	private int id;
	private String fname;
	private String lname;
	private long contact;
	private String address;
	private String email;
	private String pass;
	private String re_password;
	private String password;
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}
	
	public User(int id, String fname, String lname, long contact, String address, String email, String password,
			String re_password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.re_password = re_password;
	}
	
	
	public User(String fname, String lname, long contact, String address, String email, String password,
			String re_password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.re_password = re_password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRe_password() {
		return re_password;
	}
	public void setRe_password(String re_password) {
		this.re_password = re_password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact + ", address="
				+ address + ", email=" + email + ", password=" + password + ", re_password="
				+ re_password + "]";
	}
	
	
	
}
