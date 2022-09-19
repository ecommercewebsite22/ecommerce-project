package com.ecommerce.springbootrestdataecommercemaven.pojo;



import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class OrderPojo {
	@NotNull
	private Integer orderNo, userID;
	@NotNull
	private String date;
	@NotNull
	private Boolean orderStatus;
	
}
