package com.personal.stock.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalStockPagination {

	public Integer limit;

	public Integer offset;

	public Integer count;

	public Integer total;

}
