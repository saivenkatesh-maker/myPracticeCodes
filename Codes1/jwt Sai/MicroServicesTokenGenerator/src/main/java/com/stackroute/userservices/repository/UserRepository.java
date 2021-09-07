package com.stackroute.userservices.repository;

import com.stackroute.userservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//custom query for jpa
	User findByUserName(String username);
	User findBypassword(String password);
	User FindByUserNameAndPassword(String UserName, String password);
	
}
