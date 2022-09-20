package com.ecommerce.springbootrestdataecommercemaven.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.springbootrestdataecommercemaven.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {
	
	
	Optional<UserEntity> findByUsernameAndPassword(String username, String Password);
	
	
}
