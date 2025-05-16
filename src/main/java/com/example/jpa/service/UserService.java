package com.example.jpa.service;

import com.example.jpa.entity.Users;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.repository.UserRepositoryImpl;
import com.example.jpa.service.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	@Autowired
	UserRepositoryImpl userRepository;

	public UsersVO findUser(String tenant, String userId) {
		return userRepository.findUsersBy(tenant, userId);
//		return repository.findUsersBy(tenant, userId);
	}

}
