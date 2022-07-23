package com.personal.stock.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalStockResponse {

	public PersonalStockPagination pagination;

	public List<PersonalStockData> data = new ArrayList<PersonalStockData>();

}
