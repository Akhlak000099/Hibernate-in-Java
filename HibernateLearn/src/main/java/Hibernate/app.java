package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sessionFactory= HIbernateUtil.getSessionFactory();
		Student student = new Student();
		
		student.setName("AkhlakAnsari");
		student.setCity("New Delhi");
		student.setEmail("Akhlak000099@gmail.com");
		
		Session session= sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(student);
		transaction.commit();
		session.close();
	}

}
