package ManyToManyPkg;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {

@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String name;

@ManyToMany //(mappedBy = "Emp")
private List<EmpAddress> address;

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

public List<EmpAddress> getAddress() {
	return address;
}

public void setAddress(List<EmpAddress> address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}

}
