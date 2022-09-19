package com.ecommerce.springbootrestdataecommercemaven.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderItemsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "order_no")
	private Integer orderNo;
	
	@Column(name = "product_sku")
	private Integer productSku;
	
	@Column(name = "product_qty")
	private Timestamp productQty;
	
	@Column(name = "product_price")
	private Boolean productPrice;
}
