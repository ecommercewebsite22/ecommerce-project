package com.ecommerce.springbootrestdataecommercemaven.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.springbootrestdataecommercemaven.pojo.OrderPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.ProductPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.UserPojo;
import com.ecommerce.springbootrestdataecommercemaven.service.EcommService;

@RestController
@RequestMapping("api/ecommerce")
public class EcommController {
	
	@Autowired
	EcommService service;
	
	@GetMapping("/{user_id}")
	public UserPojo findLogin(@PathVariable("user_id") int userId){
		
		return service.findLogin(userId);
		
	}
	
	@GetMapping("/{username}/{password}")
	public UserPojo findByUsernameAndPassword(@PathVariable("username") String username, @PathVariable("password") String password){
		
		return service.findByUsernameAndPassword(username, password);
		
	}
	
	@PostMapping("")
	public OrderPojo addtoCart(@Valid @RequestBody List<ProductPojo> orderItems) {
		return service.addtoCart(orderItems);
	}

}
