package Demo.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Demo")

public class Demo {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="s_id")
private long id;

@Column(name="s_name")
private String name;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

@Column(name="s_email")
private String email;

@Column(name="s_pass")
private String pass;

public Demo(String name, String email, String pass) {
	super();
	this.name = name;
	this.email = email;
	this.pass = pass;
}

public Demo() {
	super();
}


	
}
