package com.inn.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.inn.cafe.Model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findbyEmailID(@Param("email") String email);

}
