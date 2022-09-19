package com.ecommerce.springbootrestdataecommercemaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.springbootrestdataecommercemaven.entity.OrderItemsEntity;

public interface OrderItemsDao extends JpaRepository<OrderItemsEntity, Integer> {
	
}
