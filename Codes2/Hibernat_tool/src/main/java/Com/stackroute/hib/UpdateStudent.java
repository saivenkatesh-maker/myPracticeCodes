package Com.stackroute.hib;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {
    int id=503;
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session=factory.getCurrentSession();
	try {
		session.beginTransaction();
		Student Stud=session.get(Student.class, id);
		Stud.setEmail("raj@gmail.com");
		Stud.setFirstName("Raj");
		Stud.setLastName("Shekar");
		session.save(Stud);
		session.getTransaction().commit();
		session.close();
	}catch(Exception e) {
		e.printStackTrace();
		((EntityTransaction) session).rollback();
	}
	finally {
		factory.close();
	}

	}

}
