package com.personal.stock.api.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.personal.stock.api.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer>{

	Optional<UserDetails> findByFirstNameAndLastName(String firstName, String lastName);
	
}
