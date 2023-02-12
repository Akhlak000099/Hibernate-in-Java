package ManyToManyPkg;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Emp emp = new Emp();
		emp.setId(11);
		emp.setName("Barkat Ali");
		
		Emp emp2 = new Emp();
		emp.setId(12);
		emp.setName("Akhlak Ali");
		
		EmpAddress address = new EmpAddress();
		address.setId(201);
		address.setAddress("Delhi");
		
		EmpAddress address2 = new EmpAddress();
		address.setId(202);
		address.setAddress("Haryana");
		
		List<EmpAddress> addlist= new ArrayList<EmpAddress>();
		addlist.add(address);
		addlist.add(address2);
		
		List<Emp> emplist = new ArrayList<Emp>();
		emplist.add(emp);
		emplist.add(emp2);
		
		emp.setAddress(addlist); // one user have many address
		address2.setEmps(emplist); // one address have many user
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(emp);
		session.save(emp2);
		
		session.save(address);
		session.save(address2);
		
		System.out.println("Data insert succesfully");
		transaction.commit();
		session.close();
		
		

    }
}
