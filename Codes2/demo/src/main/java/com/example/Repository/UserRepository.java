package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	User findByEmail(String email);
	User findByPassword(String Password);
	User findByEmailAndPassword(String username, String password);
	

}
