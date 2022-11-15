package Session_Factory;

import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mysql.cj.xdevapi.SessionFactory;

import Demo.Hibernate.Demo;

public class Session_Factory_Demo {

public static SessionFactory sessionFactory;	

public static SessionFactory getSessionFactory() {
	
	if(sessionFactory==null) {
		try {
			Configuration configuration = new Configuration();
			Properties settings= new Properties();
			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			settings.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			configuration.setProperties(settings);
			configuration.addAnnotatedClass(Demo.class);
			
			StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();	
			
			System.out.println("Hibernate is connnected with mysql from java");
			
			sessionFactory=(SessionFactory) configuration.buildSessionFactory(serviceRegistry);
			
			return sessionFactory;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	return sessionFactory;
	
}
}
