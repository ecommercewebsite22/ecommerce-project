package com.ecommerce.springbootrestdataecommercemaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.springbootrestdataecommercemaven.entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {
	
	// Will work on Product queries here

}
