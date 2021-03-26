package com.personal.stock.api.model;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalStockData {

	private BigInteger open;
	
	private BigInteger high;
	
	private BigInteger low;
	
	private BigInteger close;
	
	private BigInteger volume;
	
	private BigInteger adj_high;
	
	private BigInteger adj_low;
	
	private BigInteger adj_close;
	
	private BigInteger adj_open;
	
	private BigInteger adj_volume;
	
	private String symbol;
	
	private String exchange;
	
	private String date;

}
