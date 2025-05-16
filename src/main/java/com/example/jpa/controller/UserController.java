package com.example.jpa.controller;

import com.example.jpa.entity.Users;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

	private UserService service;
	private ObjectMapper objectMapper;

	@Autowired
	public UserController(UserService service, ObjectMapper objectMapper) {
		this.service = service;
		this.objectMapper = objectMapper;
	}

	@GetMapping("/{tenant}/{id}")
	public ResponseEntity getUserId(@PathVariable String tenant, @PathVariable String id ) throws Exception {

		if(this.service == null) log.debug(" service is null");

		Users users = this.service.findUser(tenant, id);
		return ResponseEntity.ok().body(this.objectMapper.writeValueAsString(users));
	}

}
