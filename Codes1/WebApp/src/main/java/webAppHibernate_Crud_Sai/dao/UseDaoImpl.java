package webAppHibernate_Crud_Sai.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import webAppHibernate_Crud_Sai.model.User;



@Component
@Transactional
public class UseDaoImpl implements UserDao {
	
//	private List<User> users;
	private SessionFactory sessionfactory;
	

	public UseDaoImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	public Boolean addUser(User user) {
		 sessionfactory.getCurrentSession().save(user);
		 return true;
	}

	public Boolean deleteUser(String Email) {
		sessionfactory.getCurrentSession().delete(getUserByEmail(Email));
		return true;
	}

	public Boolean updateUser(User user) {
//	User existingUser = getUserByEmail(user.getEmail());
	  sessionfactory.getCurrentSession().update(user);
		
			return true;
		}
		
	

	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery("from User").list();
	}

	public User getUserByEmail(String Email) {
		// TODO Auto-generated method stub
		
		return (User) sessionfactory.getCurrentSession().createQuery("from user Where email='"+Email+"'").uniqueResult();
	}

}
