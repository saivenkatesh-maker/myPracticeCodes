package webAppHibernate_Crud_Sai.dao;

import java.util.List;

import webAppHibernate_Crud_Sai.model.User;



public interface UserDao {
	
	Boolean addUser(User user);
	Boolean deleteUser(String Email);
	Boolean updateUser(User user);
	List<User> listAllUsers();
	User getUserByEmail(String Email);
	

}
