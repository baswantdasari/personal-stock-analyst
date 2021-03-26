package com.personal.stock.api.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.personal.stock.api.entity.ReqLog;
import com.personal.stock.api.model.PersonalStockResponse;
import com.personal.stock.api.model.Stock;
import com.personal.stock.api.repository.StockReqLogRepository;

@Service
public class PersonalStockService {

	@Autowired
	RestTemplate restTemplate;

	
	  @Autowired StockReqLogRepository reqLogRepository;
	 

	private String serviceUrl = "http://api.marketstack.com";

	private String accessKey = "3602e060ecc4175785a2422755182f34";

	public Stock getStockValue(String stock) throws JsonProcessingException {

		PersonalStockResponse response = getEodStockData(stock);

		if (response != null && !CollectionUtils.isEmpty(response.getData())) {

			Stock s = new Stock();
			s.setStockValue(response.getData().get(0).getOpen().toString());

			return s;

		}

		return null;

	}

	private PersonalStockResponse getEodStockData(String stock) throws JsonProcessingException {

		ResponseEntity<PersonalStockResponse> responseEntity = restTemplate.getForEntity(
				serviceUrl + "/v1/eod?access_key=" + accessKey + "&symbols=" + stock, PersonalStockResponse.class);

		
		saveReqDate(stock,responseEntity.getStatusCode().toString());
		if (responseEntity.getStatusCode().equals(HttpStatus.OK)) {

			return responseEntity.getBody();
		}

		return null;

	}

	
	  private void saveReqDate(String stock, String responseCode) {
	  
	  ReqLog reqLog = new ReqLog(); 
	  reqLog.setReqTimeStamp(new Timestamp(System.currentTimeMillis()));
	  reqLog.setResCode(responseCode);
	  reqLog.setStock(stock);
	  reqLogRepository.save(reqLog); }
	 

}
