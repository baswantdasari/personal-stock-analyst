package com.personal.stock.api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.personal.stock.api.entity.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer>{
	
	Optional<UserInfo> findByUserName(String userName);
	
	Optional<UserInfo> findByUserNameAndPassword(String userName, String password);
	
}
