package Hibernate;

import org.hibernate.SessionFactory;

public class HibernateConfigurInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        SessionFactory sessionFactory= HIbernateUtil.getSessionFactory();
		
		System.out.println(sessionFactory);
	}

}
