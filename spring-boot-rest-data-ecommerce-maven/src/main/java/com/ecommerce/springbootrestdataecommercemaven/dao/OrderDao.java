package com.ecommerce.springbootrestdataecommercemaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.springbootrestdataecommercemaven.entity.OrderEntity;

public interface OrderDao extends JpaRepository<OrderEntity,  Integer> {
	
	

}
