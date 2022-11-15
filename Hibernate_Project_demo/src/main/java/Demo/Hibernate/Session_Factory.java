package Demo.Hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

public class Session_Factory {
public static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory() {
	
	if(sessionFactory != null) {
		
		try {
			org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
			Properties setting=new  Properties();
			setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost::3306/")
 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	return sessionFactory;
	
}
}
