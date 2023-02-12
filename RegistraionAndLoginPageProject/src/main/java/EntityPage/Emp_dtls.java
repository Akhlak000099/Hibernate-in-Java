package EntityPage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp_dtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String gender;
	
	private String emp_id;
	
	private String depaterment;
	
	private String ph;
	
	private String email;
	
	private String salary;
	
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getDepaterment() {
		return depaterment;
	}
	public void setDepaterment(String depaterment) {
		this.depaterment = depaterment;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Emp_dtls(int id, String name, String gender, String emp_id, String depaterment, String ph, String email,
			String salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emp_id = emp_id;
		this.depaterment = depaterment;
		this.ph = ph;
		this.email = email;
		this.salary = salary;
		this.password = password;
	}
	public Emp_dtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp_details [id=" + id + ", name=" + name + ", gender=" + gender + ", emp_id=" + emp_id
				+ ", depaterment=" + depaterment + ", ph=" + ph + ", email=" + email + ", salary=" + salary
				+ ", password=" + password + "]";
	}
	
	
}
