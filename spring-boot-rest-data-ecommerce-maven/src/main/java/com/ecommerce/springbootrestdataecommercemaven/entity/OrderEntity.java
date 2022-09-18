package com.ecommerce.springbootrestdataecommercemaven.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ecommerce.springbootrestdataecommercemaven.pojo.ProductPojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "") // If we are dealing with values from two tables I am not sure which table we refer to here...
public class OrderEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "order_no")
	private Integer orderNo;
	
	@Column(name = "user_id")
	private String userID;
	
	@Column(name = "date")
	private String date;

	@Column(name = "")// This is not a column so what are we going to do?
	private List<ProductPojo> orderItems; 

}
