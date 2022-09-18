package com.ecommerce.springbootrestdataecommercemaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.springbootrestdataecommercemaven.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
	
	// Will work on User queries here
	
}
