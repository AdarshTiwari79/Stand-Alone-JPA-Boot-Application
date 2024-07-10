package com.boot.standAlone.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.standAlone.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	// practice of custom finder methods.
	public List<User> findByNameAndCity(String name, String city);

}
