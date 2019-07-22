import java.util.List;

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
    	
    	Person p1=new Person(128,"andrew","Fred","shonun","italy");
    	int n=dao.insertObj(p1);
    	
    	if(n > 0){
    		System.out.println("Record Inserted");
    	}
    }
    	public void findRecord(){
    	dao.displayRecord("drex");
    }
    	
    	public void displayAll(){
    		List<Person> plist=dao.showAll();
    		for(Person p:plist)
    			System.out.println(p);
    	}
}