package com.personal.stock.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.personal.stock.api.model.Registration;
import com.personal.stock.api.model.Stock;
import com.personal.stock.api.service.PersonalStockService;
import com.personal.stock.api.service.RegistrationLoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/stock")
public class PersonalStockController {

	@Autowired
	PersonalStockService personalStockService;

	@Autowired
	RegistrationLoginService registrationLoginService;

	@CrossOrigin(origins = "*")
	@GetMapping(path = "/api", produces = "application/json")
	public Stock getPersonalStock(@RequestParam(value = "stock", required = true) String stock) {

		log.info("Get details for stock ::" + stock);

		try {
			return personalStockService.getStockValue(stock);
		} catch (JsonProcessingException e) {
			log.error("cannot parser the json for the stock - {}" + stock);
		}

		return null;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(path = "/login")
	public boolean checkLoginInfomration(@RequestParam(value = "user", required = true) String user,
			@RequestParam(value = "password", required = true) String password) {

		log.info("Get details for user :: "+user+ " and password :: "+password);

		return registrationLoginService.validateUserCredentails(user, password);

	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/register", consumes = "application/json" , produces = "application/json")
	public boolean RegistrationLoginInfomration(@RequestBody Registration registration) {
		return registrationLoginService.saveRegistrationInfomration(registration);

	}
}
