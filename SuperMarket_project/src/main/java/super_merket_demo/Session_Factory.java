package super_merket_demo;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Session_Factory {
	public static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			try {
				org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
				Properties setting=new  Properties();
				setting.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				setting.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate");
				setting.put(Environment.USER,"root");
				setting.put(Environment.PASS,"root");
				
				setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				setting.put(Environment.SHOW_SQL, "true");
				setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				setting.put(Environment.HBM2DDL_AUTO, "create-drop");
	 
				configuration.setProperties(setting);
				configuration.addAnnotatedClass(SuperMarketProduct.class);
				
				ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate is Connected");
				
				sessionFactory =  configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory; 
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
		
	}
}
