package com.example.jpa;

import com.example.jpa.entity.QUsers;
import com.example.jpa.entity.Users;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@Slf4j
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JpaTest {

	@MockitoBean
	private UserService userService;

	@Autowired
	UserRepository repository;

	@Test
	void findTest() {
		Users users = repository.findUsersBy("DMO", "000000");
	}

	@Test
	void queryDSLtest() {


	}

}
