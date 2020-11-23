package com.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senforagespring.entities.User;

@Repository
public interface IUser extends JpaRepository<User, Integer> {
	@Query("SELECT u FROM User u where u.email=:email AND u.password=:password")
	public User getUserbyEmailAndPassword(@Param("email") String email,
			@Param("password") String password);
	
}
