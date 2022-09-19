package com.ecommerce.springbootrestdataecommercemaven.pojo;

import javax.validation.constraints.NotNull;

public class OrderItemsPojo {
	
	private int itemId;
	
	@NotNull
	private Integer orderNo, productSku, productQty;
	@NotNull
	Double productPrice;
	

}
