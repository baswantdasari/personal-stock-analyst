package com.personal.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.person.stock.model.PersonalStockResponse;

@Service
public class PersonalStockService {
	
	@Autowired
	RestTemplate restTemplate;
	
	private String serviceUrl= "http://api.marketstack.com";
	
	private String accessKey = "";
	
	public PersonalStockResponse getEodStockData(String stock) {
		
		 return restTemplate.getForObject( serviceUrl+"/v1/eod?access_key="+accessKey +"&symbols="+stock, PersonalStockResponse.class);
		
	}

}
