
public class Teacher {
	
	private String firstname;
	private int age;
	private String lastname;
	
	public Teacher(){
		super();
	}
	public Teacher(String firstname, int age, String lastname) {
		super();
		this.firstname = firstname;
		this.age = age;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirtsname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
