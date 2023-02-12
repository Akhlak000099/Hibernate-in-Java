package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateConfigurByXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World !");
		
		Configuration cfg= new Configuration();
		
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		
		System.out.println(factory);
	}

}
