package HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoPage {

  private SessionFactory sessionFactory;

public UserDaoPage(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
}
   
public boolean saveDao(Users_details details) {
	
	boolean f= false;
	
	SessionFactory sFactory = HibernateUtil.getSessionFactory();
	Session session = sFactory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	int i= (Integer)session.save(details);
	if(i>0) {
		f = true;
	}
	
	transaction.commit();
	
	return f;
}

}
