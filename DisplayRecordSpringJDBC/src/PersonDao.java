import java.util.List;

public interface PersonDao {
	
	public int insertObj(Person p);

	public void displayRecord(String s);

	public List<Person> showAll();
	
}
