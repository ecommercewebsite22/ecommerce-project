package com.ecommerce.springbootrestdataecommercemaven.pojo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
// use this constructor for order items
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode


public class ProductPojo {
	private int sku, productQuantity, orderNo;
	@NotNull
	private String productName, productImage;
	private double productPrice;
	
	// use this for new inventory products
	public ProductPojo(int sku, String productName, String productImage, int productQuantity, double productPrice) {
		this.sku = sku;
		this.productName = productName;
		this.productImage = productImage;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.orderNo = 0;
	}
	
}

