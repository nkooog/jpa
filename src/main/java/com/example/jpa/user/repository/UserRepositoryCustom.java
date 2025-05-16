package com.example.jpa.user.repository;

import com.example.jpa.user.service.model.vo.UsersVO;

public interface UserRepositoryCustom {

	UsersVO findUsersBy(String tenantId, String usrId);

}
