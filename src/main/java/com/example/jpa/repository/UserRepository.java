package com.example.jpa.repository;

import com.example.jpa.entity.Users;
import com.example.jpa.entity.UsersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, UsersId> {

	@Query("select x from Users x where x.id.tenantId = ?1 and x.id.usrId = ?2")
	Users findUsersBy(String tenantId, String usrId);

}
