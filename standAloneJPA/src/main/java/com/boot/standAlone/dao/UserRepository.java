package com.boot.standAlone.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.boot.standAlone.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	// practice of custom finder methods.
	public List<User> findByNameAndCity(String name, String city);
	
	// Practice for JPQL 
	@Query("select u from user_details u where u.name= :n")
	public List<User> getUserByName(@Param("n") String name);
	
	// Practice for native query
	@Query(value="select * from user_details",nativeQuery = true)
	public List<User> getAll();

}
