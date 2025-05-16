package com.example.jpa.user.service.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
@Data
public class UsersId implements Serializable {

	@Column(name = "tenant_id")
	private String tenant_id;

	@Column(name = "usr_id")
	private String usr_id;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsersId usersId = (UsersId) o;

		return Objects.equals(tenant_id, usersId.tenant_id) &&
				Objects.equals(usr_id, usersId.usr_id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tenant_id, usr_id);
	}
}
