package com.example.jpa.repository;

import com.example.jpa.entity.Users;

public interface UserRepositoryCustom {

	Users findUsersBy(String tenantId, String usrId);

}
