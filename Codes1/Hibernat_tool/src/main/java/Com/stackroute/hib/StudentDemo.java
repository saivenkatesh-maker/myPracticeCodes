package Com.stackroute.hib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDemo {
	public static void main(String[] args) {
		//create Session factory as a first step
		SessionFactory factory =
				new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		
		//create session as second step
		Session session1 =factory.getCurrentSession();
		
		try {
			System.out.println("Saving data inside database table");
			// here the transaction begins
			session1.beginTransaction();
			session1.save(new Student(505, "sai", "venkatesha", "sai@gmail.com"));
			//committing transcation
			session1.getTransaction().commit();
			System.out.println("Data got stored in db");
			session1.close();
		    factory.close();
//		    factory.openSession();
//			session1.close();
		    Session session2 =factory.getCurrentSession();
		  session2.beginTransaction();
		  session2.save(new Student(502, "Ravi", "Raj", "Ravi@gmail.com"));
		  session2.getTransaction().commit();
		  session2.close();
		  factory.close();
//		  session2.beginTransaction();
//		  session2.save(new Student(503,"Naman", "veer", "Naman@gmail.com"));
//		  session2.getTransaction();
//		  session1.close();
//		  System.out.println("Saving data inside database table");
//			// here the transaction begins
//			session2.beginTransaction();
//			session2.save(new Student(504, "sai", "venkatesha", "sai@gmail.com"));
//			
//			//committing transcation
//			session2.getTransaction().commit();
//			System.out.println("Data got stored in db");
//		  session2.beginTransaction();
//		  session2.save(new Student(505, "Ravi", "Raj", "Ravi@gmail.com"));
//		  session2.getTransaction().commit();
//		  
//		  session2.beginTransaction();
//		  session2.save(new Student(506,"Naman", "veer", "Naman@gmail.com"));
//		  session2.getTransaction();
//		  session2.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
			
		}
		
		
		
}


