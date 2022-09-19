package com.ecommerce.springbootrestdataecommercemaven.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.springbootrestdataecommercemaven.dao.UserDao;
import com.ecommerce.springbootrestdataecommercemaven.entity.UserEntity;
import com.ecommerce.springbootrestdataecommercemaven.pojo.OrderPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.ProductPojo;
import com.ecommerce.springbootrestdataecommercemaven.pojo.UserPojo;

@Service
public class EcommServiceImpl implements EcommService {
	
	@Autowired
	UserDao userDao;
	
	public EcommServiceImpl() {

	}

	@Override
	public UserPojo findLogin(int userId) {
		Optional<UserEntity> optionalUserEntity = userDao.findById(userId);
		UserPojo fecthedUserPojo = null;
		if (optionalUserEntity.isPresent()) {
			fecthedUserPojo = new UserPojo();
			BeanUtils.copyProperties(optionalUserEntity.get(), fecthedUserPojo);
		}
		return fecthedUserPojo;
	}

	@Override
	public UserPojo findByUsernameAndPassword(String username, String password) {
		Optional<UserEntity> optionalUserEntity = userDao.findByUsernameAndPassword(username, password);
		UserPojo fecthedUserPojo = null;
		if (optionalUserEntity.isPresent()) {
			fecthedUserPojo = new UserPojo();
			BeanUtils.copyProperties(optionalUserEntity.get(), fecthedUserPojo);
		}
		return fecthedUserPojo;
	}

	@Override
	public OrderPojo addtoCart(List<ProductPojo> orderItems) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	/*public OrderPojo addtoCart(List<ProductPojo> orderItems) {
		OrderEntity newOrderEntity = new OrderEntity();
		BeanUtils.copyProperties(orderItems, newOrderEntity);
		//OrderEntity newOrderEntity = userDao.saveAndFlush(newOrderEntity);
		
		//return orderItems;
	}*/
	

}
