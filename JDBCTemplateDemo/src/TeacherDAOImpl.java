import org.springframework.jdbc.core.JdbcTemplate;

public class TeacherDAOImpl implements TeacherDAO {
	
	JdbcTemplate jdt;
	

	public TeacherDAOImpl(JdbcTemplate jdt) {
		super();
		this.jdt = jdt;
	}


	@Override
	public int insertValues(Teacher tc) {
		
		Object []arr={tc.getFirstname(), tc.getAge(), tc.getLastname() };
		int n = jdt.update("insert into Teacher(firstname,age,lastname) values (?.?.?)");
		return n;
		
	}

}
