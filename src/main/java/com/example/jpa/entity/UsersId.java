package com.example.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@Data
public class UsersId implements Serializable {

	@Column(name = "tenant_id")
	private String tenantId;

	@Column(name = "usr_id")
	private String usrId;

}
