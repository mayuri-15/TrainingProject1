import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDaoImpl implements PersonDao {

    JdbcTemplate jdt;


public PersonDaoImpl() {
		super();
	}


public PersonDaoImpl(JdbcTemplate jdt) {
	super();
	this.jdt = jdt;
}


@Override
public void displayRecord(String s) {
	// TODO Auto-generated method stub
	Object [] para={s};
	Person p=jdt.queryForObject("select * from persons where lastname=?",para,new PersonRowMapper());
	System.out.println("Id: "+p.getId()+"\nLastname: "+p.getLastname()+"\nFirstname: "+p.getFirstname()+"\nAddress :"+p.getAddress()+"\nCity: "+p.getCity());
}


@Override

	public int insertObj(Person p) {
		
		Object []param={p.getId(), p.getLastname(), p.getFirstname(),p.getAddress(),p.getCity()};
		
		int n=jdt.update("insert into persons values(?,?,?,?,?)", param);
		
		return n;
	}



@Override
public List<Person> showAll() {
	List<Person> plist=(List<Person>)jdt.query("select * from persons", new PersonRowMapper());
	return plist;
}
}


