
import javax.sql.DataSource;

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


	public int insertObj(Person p) {
		
		Object []param={p.getPname(), p.getPadd(), p.getAge()};
		
		int n=jdt.update("insert into person values(?,?,?)", param);
		
		return n;
	}

}
