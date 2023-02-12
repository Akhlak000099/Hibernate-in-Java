package HibernateProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users_details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullname;
	
	private String username;
	
	private String email;
	
	private String phone;
	
	private String password;

	public Users_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users_details(String fullname, String username, String email, String phone, String password) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users_details [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + "]";
	}
	
	
	
}
