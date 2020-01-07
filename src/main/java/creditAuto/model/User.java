package creditAuto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_")
public class User {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column
	private String userFirstname;
	
	@Column
	private String userLastname;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	//private Role roleObject;
//	
//	@Column
//	private int role;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Role role;


	
	public User() {}
	
	public User(Long id, String userFirstname, String userLastname, String username, String password, Role role) {
		Id = id;
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public User(String userFirstname, String userLastname, String username, String password, Role role) {
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserFirstname() {
		return userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserLastname() {
		return userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", userFirstname=" + userFirstname + ", userLastname=" + userLastname + ", username="
				+ username + ", password=" + password + ", role=" + role + "]";
	}
	
	
	

}
