package com.example.jpa.repository;

import com.example.jpa.entity.QUsers;
import com.example.jpa.entity.Users;
import com.example.jpa.service.vo.UsersVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom{

	private final ObjectMapper objectMapper;
	private final JPAQueryFactory jpaQueryFactory;
	private final QUsers qUsers = QUsers.users;

	@Override
	public UsersVO findUsersBy(String tenantId, String usrId) {

		Users users = this.jpaQueryFactory
				.select(this.qUsers)
				.from(this.qUsers)
				.where(
						 this.qUsers.id.tenantId.eq(tenantId)
						,this.qUsers.id.usrId.eq(usrId)
				)
				.fetchOne();

		return this.objectMapper.convertValue(users, UsersVO.class)
				;
	}
}
