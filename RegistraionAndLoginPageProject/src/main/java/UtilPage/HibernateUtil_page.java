package UtilPage;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import EntityPage.Emp_dtls;

public class HibernateUtil_page {

	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			
			Configuration configuration = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/student_details");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "root");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			properties.put(Environment.HBM2DDL_AUTO,"update");
			properties.put(Environment.SHOW_SQL, true);
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Emp_dtls.class);
			
			 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}
		
		return sessionFactory;
	}
	}