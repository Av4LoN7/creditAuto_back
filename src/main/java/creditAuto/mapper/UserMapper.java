package creditAuto.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import creditAuto.model.Role;
import creditAuto.model.User;

@Service
public final class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user1 = new User();
		user1.setUserFirstname(rs.getString("userFirstname"));
		user1.setUserLastname(rs.getString("userLastname"));
		user1.setId(rs.getLong("id"));
		user1.setUsername(rs.getString("username"));
		user1.setPassword(rs.getString("password"));

		String role = (rs.getString("role"));

		switch (role) {
		case "ADMIN":
			user1.setRole(Role.ADMIN);
			break;
		case "MANAGER":
			user1.setRole(Role.MANAGER);
			break;
		case "CUSTOMERADVISER":
			user1.setRole(Role.CUSTOMERADVISER);
			break;
		}

		return user1;
	}

}
