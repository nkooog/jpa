package com.example.jpa.user.service;

import com.example.jpa.user.repository.impl.UserRepositoryImpl;
import com.example.jpa.user.service.model.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepositoryImpl userRepository;

	public UsersVO findUser(String tenant, String userId) {
		return userRepository.findUsersBy(tenant, userId);
//		return repository.findUsersBy(tenant, userId);
	}

}
