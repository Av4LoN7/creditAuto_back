package creditAuto.config;

import javax.sql.DataSource; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class JdbcDataSource {
	
	protected JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource data) {
		this.jdbcTemplate = new JdbcTemplate(data);
	}

}