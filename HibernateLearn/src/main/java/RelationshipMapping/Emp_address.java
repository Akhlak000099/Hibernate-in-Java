package RelationshipMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Emp_address {

	@Id
	private int id;
	
	private String address;
	
	@OneToOne (mappedBy = "address") // mappedBy is used for to hide the column from table but we can to use for access the data
	private Emp_Data emp_Data;

	public Emp_Data getEmp_Data() {
		return emp_Data;
	}
	public void setEmp_Data(Emp_Data emp_Data) {
		this.emp_Data = emp_Data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
