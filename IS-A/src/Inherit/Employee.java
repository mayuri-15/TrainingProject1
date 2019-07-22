package Inherit;

public class Employee  {
	private String name;
	private int age;
	private String address;
	private String cname;
	private double salary;
	private String profile;
	
	public Employee(){
		super();
	}
	public Employee(String name, int age, String address, String cname, double salary, String profile) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.cname = cname;
		this.salary = salary;
		this.profile = profile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	

}
