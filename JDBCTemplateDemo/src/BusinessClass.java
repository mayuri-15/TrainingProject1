
public class BusinessClass {
TeacherDAO dao;

public BusinessClass(TeacherDAO dao) {
	super();
	this.dao = dao;
}

public int insertRow()
{
	
	Teacher t=new Teacher("Nidhi",30,"Sharma");
	int n=dao.insertValues(t);
	
	if(n>0)
	{
		System.out.println("Record Inserted");
	}
	return n;
}
	
	
}
