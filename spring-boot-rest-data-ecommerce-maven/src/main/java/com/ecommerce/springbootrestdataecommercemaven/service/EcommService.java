package com.ecommerce.springbootrestdataecommercemaven.service;

import java.util.List;

import com.ecommerce.springbootrestdataecommercemaven.pojo.OrderPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.ProductPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.UserPojo;

public interface EcommService {
	
	// Fetches user information
	UserPojo findLogin(int userId);
	
	UserPojo findByUsernameAndPassword(String username, String Password);
	
	OrderPojo addtoCart(List<ProductPojo> orderItems);

}
