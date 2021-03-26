package com.personal.stock.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Registration implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String password;

	
}
