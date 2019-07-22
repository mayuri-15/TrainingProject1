

public class BusinessClass {
      PersonDao dao;

	public BusinessClass() {
		super();
	}

	public BusinessClass(PersonDao dao) {
		super();
		this.dao = dao;
	}
      
    public void insertRow(){
    	
    	Person p1=new Person("Anubhuti","Pune",20);
    	int n=dao.insertObj(p1);
    	
    	if(n > 0){
    		System.out.println("Record Inserted");
    	}
    }
}
