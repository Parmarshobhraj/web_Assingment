package Crud_jsp_servlet;

public class Student {

	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String gender;
	private String password;
	private long mobile;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String fname, String lname, String email, String gender, String password, long mobile) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.mobile = mobile;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender=" + gender
				+ ", password=" + password + ", mobile=" + mobile + "]";
	}

	
}
