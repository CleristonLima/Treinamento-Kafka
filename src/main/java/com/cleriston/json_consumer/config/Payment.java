package com.cleriston.json_consumer.config;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class Payment implements Serializable {

	private Long id;
	private Long idUser;
	private Long idProduct;
	private String cardNumber;
	
	
	
}
