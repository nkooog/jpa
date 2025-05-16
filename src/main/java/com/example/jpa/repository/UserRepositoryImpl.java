package com.example.jpa.repository;

import com.example.jpa.entity.QUsers;
import com.example.jpa.entity.Users;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom{

	private final JPAQueryFactory jpaQueryFactory;
	private final QUsers qUsers = QUsers.users;

	public UserRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
		this.jpaQueryFactory = jpaQueryFactory;
	}

	@Override
	public Users findUsersBy(String tenantId, String usrId) {
		return this.jpaQueryFactory
				.select(this.qUsers)
				.where(
						 this.qUsers.id.tenantId.eq(tenantId)
						,this.qUsers.id.usrId.eq(usrId)
				)
				.fetchOne()
				;
	}
}
