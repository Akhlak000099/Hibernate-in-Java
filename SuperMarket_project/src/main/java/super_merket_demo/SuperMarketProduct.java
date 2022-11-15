package super_merket_demo;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="SuperMarketStore")
public class SuperMarketProduct {
   @Id
   @GeneratedValue (strategy = GenerationType.AUTO)
   @Column(name="p_id")
	private long p_id;
   
   @Column(name="a")
	private String p_name;
   
   @Column(name="b")
	private String p_category;
   
   @Column(name="c")
	private String p_expiryDate;
   
   @Column(name="d")
	private String p_price;
   
public long getP_id() {
	return p_id;
}
public void setP_id(long p_id) {
	this.p_id = p_id;
}

public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}

public String getP_category() {
	return p_category;
}
public void setP_category(String p_category) {
	this.p_category = p_category;
}

public String getP_expiryDate() {
	return p_expiryDate;
}
public void setP_expiryDate(String p_expiryDate) {
	this.p_expiryDate = p_expiryDate;
}

public String getP_price() {
	return p_price;
}
public void setP_price(String p_price) {
	this.p_price = p_price;
}

public SuperMarketProduct(String p_name, String p_category, String p_expiryDate, String p_price) {
	super();
	this.p_name = p_name;
	this.p_category = p_category;
	this.p_expiryDate = p_expiryDate;
	this.p_price = p_price;
}
public SuperMarketProduct() {
	super();
}
   
}
