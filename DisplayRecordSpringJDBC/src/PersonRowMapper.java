import java.sql.*;
import org.springframework.jdbc.core.RowMapper;


public class PersonRowMapper implements RowMapper <Person>{

	
	public Person mapRow(ResultSet rs,int rownum) throws SQLException{
		Person p=new Person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		return p;
	}
}
