package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findById(int id);

	User findByNameAndPassword(String name, String password);

}
