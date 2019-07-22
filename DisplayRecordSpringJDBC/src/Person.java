
public class Person {
	
	private int id;
	private String lastname;
	private String firstname;
	private String address;
	private String city;
	
	
	public Person(){
		super();
	}
	public Person(int id, String lastname, String firstname, String address, String city) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", address=" + address
				+ ", city=" + city + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
