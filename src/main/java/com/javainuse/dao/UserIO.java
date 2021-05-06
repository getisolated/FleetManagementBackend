package com.javainuse.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.javainuse.model.User;

@Repository
public interface UserIO extends CrudRepository<User, Integer> {

	User findByEmail(String email);
}