package com.personal.stock.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.stock.api.entity.UserDetails;
import com.personal.stock.api.entity.UserInfo;
import com.personal.stock.api.model.Registration;
import com.personal.stock.api.repository.UserDetailsRepository;
import com.personal.stock.api.repository.UserInfoRepository;

@Service
public class RegistrationLoginService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Autowired
	private UserInfoRepository userInfoRepository;

	private boolean checkUserNameExits(String userName) {
		if (userInfoRepository.findByUserName(userName).isPresent()) {
			return true;
		}
		return false;
	}

	public boolean saveRegistrationInfomration(Registration registration) {

		if (!checkUserNameExits(registration.getUserName()) && !userDetailsRepository
				.findByFirstNameAndLastName(registration.getFirstName(), registration.getLastName()).isPresent()) {

			UserInfo userInfo = new UserInfo();
			userInfo.setUserName(registration.getUserName());
			userInfo.setPassword(registration.getPassword());
			userInfoRepository.save(userInfo);

			UserDetails userDetails = new UserDetails();
			userDetails.setFirstName(registration.getFirstName());
			userDetails.setLastName(registration.getLastName());
			userDetails.setUserName(registration.getUserName());
			userDetailsRepository.save(userDetails);

			if (userDetailsRepository
					.findByFirstNameAndLastName(registration.getFirstName(), registration.getLastName()).isPresent()
					&& validateUserCredentails(registration.getUserName(), registration.getPassword())) {
				return true;
			}
		}

		return false;

	}

	public boolean validateUserCredentails(String userName, String password) {

		if (userInfoRepository.findByUserNameAndPassword(userName, password).isPresent()) {
			return true;
		}
		return false;
	}

}
