package ManyToManyPkg;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class EmpAddress {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    private String address;
	
    @ManyToMany
	private List<Emp> emps;
	
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

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public EmpAddress(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
