package com.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
