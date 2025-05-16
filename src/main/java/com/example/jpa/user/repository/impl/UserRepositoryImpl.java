package com.example.jpa.user.repository.impl;

import com.example.jpa.user.repository.UserRepositoryCustom;
import com.example.jpa.user.service.model.entity.QUsers;
import com.example.jpa.user.service.model.entity.Users;
import com.example.jpa.user.service.model.vo.UsersVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

	private final ObjectMapper objectMapper;
	private final JPAQueryFactory jpaQueryFactory;
	private final QUsers qUsers = QUsers.users;

	@Override
	public UsersVO findUsersBy(String tenantId, String usrId) {

		Users users = this.jpaQueryFactory
				.select(this.qUsers)
				.from(this.qUsers)
				.where(
							this.qUsers.usersId.tenant_id.eq(tenantId)
						,   this.qUsers.usersId.usr_id.eq(usrId)
				)
				.fetchOne();

		return this.objectMapper.convertValue(users, UsersVO.class)
				;
	}
}
