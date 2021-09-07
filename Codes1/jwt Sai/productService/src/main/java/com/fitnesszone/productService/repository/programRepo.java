package com.fitnesszone.productService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fitnesszone.productService.model.Program;
@Repository
public interface programRepo extends MongoRepository<Program,String>
{

	List<Program> findByActiveTrue();
	List<Program> findBydurationInMonths(int durationInMonths);
}
