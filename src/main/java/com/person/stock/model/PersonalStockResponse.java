package com.person.stock.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalStockResponse {
	
	public PersonalStockPagination pagination;
	
	public List<PersonalStockData> data = new ArrayList<PersonalStockData>();

	/**
	 * @return the pagination
	 */
	public PersonalStockPagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(PersonalStockPagination pagination) {
		this.pagination = pagination;
	}

	/**
	 * @return the data
	 */
	public List<PersonalStockData> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<PersonalStockData> data) {
		this.data = data;
	}


	

}
