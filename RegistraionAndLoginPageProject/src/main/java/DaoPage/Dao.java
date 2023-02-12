package DaoPage;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import EntityPage.Emp_dtls;
import UtilPage.HibernateUtil_page;

public class Dao {
	private SessionFactory sessionFactory;


	public Dao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public boolean saveDao(Emp_dtls details) {
		
		boolean f=false;
		
		SessionFactory sFactory = HibernateUtil_page.getSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		int i= (Integer)session.save(details);
		
		if(i>0) {
			f= true;
		}
		
		transaction.commit();
//		session.close();
		
		return f;
	}
		
	public boolean IsLogin(String id,String email,String password) {
		boolean f=false;
		
		Emp_dtls dtls= new Emp_dtls();
		SessionFactory sessionFactory = HibernateUtil_page.getSessionFactory();
		Session session= sessionFactory.openSession();
		
		Query query = session.createQuery("from Emp_dtls where email=:em and password=:pass and emp_id=:id");
		query.setParameter("em", email);
		query.setParameter("pass",password);
		query.setParameter("id", id);
		
		if(query.uniqueResult()!=null) {
			f=true;
			
		}
		
		
		return f;
	}
	

		
		 public static List < Emp_dtls > getAllUser() {
			 
			 SessionFactory factory= HibernateUtil_page.getSessionFactory();
			 Session session = factory.openSession();
			 
		        Transaction transaction = null;
		        List < Emp_dtls > listOfUser = null;
		            // start a transaction
		            transaction = session.beginTransaction();
		            // get an user object

		            listOfUser = session.createQuery("from Emp_dtls").getResultList();

		            // commit transaction
		            transaction.commit();
					return listOfUser;
	}
}
