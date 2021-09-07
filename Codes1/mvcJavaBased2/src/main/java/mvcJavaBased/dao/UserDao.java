package mvcJavaBased.dao;

import java.util.List;

import mvcJavaBased.model.User;

public interface UserDao {
	
	Boolean addUser(User user);
	Boolean deleteUser(String Email);
	Boolean updateUser(User user);
	List<User> listAllUsers();
	User getUserByEmail(String Email);
	

}
