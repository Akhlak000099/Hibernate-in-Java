package RelationshipMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Emp_address address = new Emp_address();
		address.setId(202);
		address.setAddress("Banglore");
		
		Emp_Data data= new Emp_Data();
		data.setId(102);
		data.setName("Barkat Ali");
		data.setAddress(address);
		
		address.setEmp_Data(data);

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(data);
//		session.save(address);
		
		
//		Emp_Data data2= (Emp_Data) session.get(Emp_Data.class,101);
//		System.out.println(data2.getName());
//		System.out.println(data2.getAddress().getAddress());
//		
		
		Emp_address address2 = (Emp_address) session.get(Emp_address.class, 201);
		System.out.println(address2.getAddress());
		System.out.println(address2.getEmp_Data().getName());
		transaction.commit();
		
		session.close();
		System.out.println("Insert Successfully");
	
	}

}
