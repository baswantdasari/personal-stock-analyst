package com.personal.stock.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.personal.stock.application.PersonalStockApplication;
import com.personal.stock.service.PersonalStockService;

@RestController
public class PersonalStockController {
	
	@Autowired
	PersonalStockService personalStockService;
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(PersonalStockApplication.class);
	
	@GetMapping(path = "stock/api")
	public String getPersonalStock(@RequestParam(value = "stock", required = true) String stock) {
		
		log.info("Get details for stock ::" +stock);
		
		return personalStockService.getEodStockData(stock).toString();
		
	}

}
