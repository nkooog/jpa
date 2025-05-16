package com.example.jpa.repository;

import com.example.jpa.entity.Users;
import com.example.jpa.entity.UsersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, UsersId>, UserRepositoryCustom {

}
