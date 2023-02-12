package HQL_App;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		
		student_details details = new student_details();
		details.setName("AkhlakAnsari");
		details.setAddress("Delhi");
		
		student_details details2 = new student_details();
		details2.setName("AkhlakAnsari");
		details2.setAddress("Delhi");
		Session session= sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		session.save(details);
//		session.save(details2);
		
////		HQL use in hibernate ***(1) fetch all row and column from database 
//		Query<student_details> query= session.createQuery("from student_details");
//		
//		List<student_details> list= query.list();
//		for(student_details s:list) {
//			System.out.println(s);
//		}
		
////	***(2) fetch a row from database	
//Query<student_details> query=session.createQuery("from student_details where id='1' and name='AkhlakAnsari'");
//System.out.println(query.uniqueResult());
		
////	***(3)	fetch a row from database by user
//		Query<student_details> query=session.createQuery("from student_details where id =: id and name=:nm ");
																																																																																																																																																																																																		//		query.setParameter("id", 2);
//		query.setParameter("id", 2);
//		query.setParameter("nm","AkhlakAnsari" );																																																																																																																																																																																																	//		query.setParameter("nm","AkhlakAnsari" );
//		System.out.println(query.uniqueResult());
		
////		****(4) fetch data in order by desc
//		Query< student_details> query= session.createQuery("from student_details order by id desc");
//		List<student_details> list= query.list();
//		for(student_details s:list) {
//			System.out.println(s);
//		}
		
////		*****(5) delete a row from database
//		Query< student_details> query= session.createQuery("delete from student_details where id='2'");
//		int i= query.executeUpdate();
//		System.out.println(i+" delete successfully");
		
//		Query< student_details> query= session.createQuery("update student_details set address='Bihar' where id='1'");
//		int i= query.executeUpdate();
//		System.out.println(i + " update successfully");
		
		transaction.commit();
		System.out.println("Register Successfully");
		session.close();
	}

}
