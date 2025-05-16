package com.example.jpa.repository;

import com.example.jpa.entity.Users;
import com.example.jpa.service.vo.UsersVO;

public interface UserRepositoryCustom {

	UsersVO findUsersBy(String tenantId, String usrId);

}
