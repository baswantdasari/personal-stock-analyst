package com.personal.stock.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.personal.stock.api.entity.ReqLog;

public interface StockReqLogRepository extends CrudRepository<ReqLog, Integer> {

}
