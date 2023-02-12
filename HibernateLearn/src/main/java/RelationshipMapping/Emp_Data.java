package RelationshipMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Emp_Data {

	@Id
	private int id;

	private String name;
	
	@OneToOne
	private Emp_address address;

	public Emp_address getAddress() {
		return address;
	}
	public void setAddress(Emp_address address) {
		this.address = address;
	}
	
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

}
