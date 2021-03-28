package techies.minor.javabeans;

public class Admin {

	private int id;
	private String firstname;
	private String lastname;
	private int adminid;
	private long contact;
	private String address;
	private String email;
	private String password;
	private String re_password;
	private String active_status;
	
	
	
	public Admin() {
		super();
	}
	public Admin(int id, String firstname, String lastname, int adminid, long contact, String address, String email,
			String password, String re_password, String active_status) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.adminid = adminid;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.re_password = re_password;
		this.active_status = active_status;
	}
	
	public Admin(String firstname, String lastname, int adminid, long contact, String address, String email,
			String password, String re_password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adminid = adminid;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.re_password = re_password;

	}
	
	public Admin(String firstname, String lastname, int adminid, long contact, String address, String email,
			String password, String re_password , String active_status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adminid = adminid;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.re_password = re_password;
		this.active_status=active_status;

	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getActive_status() {
		return active_status;
	}
	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", adminid=" + adminid
				+ ", contact=" + contact + ", address=" + address + ", email=" + email + ", password=" + password
				+ ", re_password=" + re_password + ", active_status=" + active_status + "]";
	}
	
	
}
