package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sessionFactory = HIbernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
//		Student student= session.load(Student.class,1);
		Student student= session.get(Student.class,1);
		
		System.out.println(student);
	}

}
