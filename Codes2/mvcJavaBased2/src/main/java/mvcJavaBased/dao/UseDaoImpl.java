package mvcJavaBased.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import mvcJavaBased.model.User;

@Component
public class UseDaoImpl implements UserDao {
	
	private List<User> users;
	

	public UseDaoImpl(List<User> users) {
		super();
		this.users = new ArrayList<User>();
	}

	public Boolean addUser(User user) {
		return users.add(user);
	}

	public Boolean deleteUser(String Email) {
		User ExistingUser = getUserByEmail(Email);
		if(ExistingUser!=null) {
			users.remove(ExistingUser);
			return true;
		}
		return false;
	}

	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		User ExistingUser = getUserByEmail(user.getEmail());
		if(ExistingUser!=null) {
			ExistingUser.setCity(user.getCity());
			ExistingUser.setName(user.getName());
//			ExistingUser.setEmail(user.getEmail());
			return true;
		}
		return false;
	}

	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	public User getUserByEmail(String Email) {
		// TODO Auto-generated method stub
		
		Iterator itr =users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = (User) itr.next();
			if(Email.equals(user.getEmail())) {
				return user;
			}
		}
		return null;
	}

}
