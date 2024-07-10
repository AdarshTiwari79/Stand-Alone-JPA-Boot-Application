package com.boot.standAlone.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.standAlone.entities.User;

public interface UseRepository extends CrudRepository<User, Integer>{

}
