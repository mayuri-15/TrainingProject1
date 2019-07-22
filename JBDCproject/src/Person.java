
public class Person {
      private String pname;
      private String padd;
      private int age;
      
      
	public Person() {
		super();
	}
	
	public Person(String pname, String padd, int age) {
		super();
		this.pname = pname;
		this.padd = padd;
		this.age = age;
	}

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
      
      
}
