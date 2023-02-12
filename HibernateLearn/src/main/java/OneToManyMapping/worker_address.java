package OneToManyMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class worker_address {

	@Id
	private int id;
	
	private String city;
	
	private String state;
	
    @ManyToOne
	private worker_dtls dtls;

	public worker_dtls getDtls() {
		return dtls;
	}
	public void setDtls(worker_dtls dtls) {
		this.dtls = dtls;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public worker_address(int id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	public worker_address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
