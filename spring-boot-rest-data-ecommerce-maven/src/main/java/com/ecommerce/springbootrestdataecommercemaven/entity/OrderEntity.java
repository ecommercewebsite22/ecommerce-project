package com.ecommerce.springbootrestdataecommercemaven.entity;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "orders") // If we are dealing with values from two tables I am not sure which table we refer to here...

public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "order_no")
	private Integer orderNo;
	
	@Column(name = "user_id")
	private int userID;
	
	@Column(name = "order_date")
	private Timestamp date;
	
	@Column(name = "order_status")
	private String orderStatus;

}
