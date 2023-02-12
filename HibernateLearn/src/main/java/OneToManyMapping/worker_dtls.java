package OneToManyMapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class worker_dtls {

	@Id
	private int id;
	
	private String name;
	
	@OneToMany  //// (mappedBy = "worker_dtls") learn hot to work it 
	private List<worker_address> address;

	public List<worker_address> getAddress() {
		return address;
	}

	public void setAddress(List<worker_address> address) {
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

	
	public worker_dtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public worker_dtls(int id, String name, List<worker_address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}
