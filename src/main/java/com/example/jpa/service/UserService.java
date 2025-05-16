package com.example.jpa.service;

import com.example.jpa.entity.Users;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {

	@Autowired
	UserRepository repository;

	public Users findUser(String tenant, String userId) {
		return repository.findUsersBy(tenant, userId);
	}

}
