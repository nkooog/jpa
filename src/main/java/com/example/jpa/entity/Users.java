package com.example.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_usr_info_mgnt")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Users {

	@EmbeddedId
	private UsersId id;

	@Column(name = "scrt_no")
	private String scrt_no;

	@JsonProperty("tenant_id")
	public String getTenantId() {
		return id.getTenantId();
	}

	@JsonProperty("usr_id")
	public String getUsrId() {
		return id.getUsrId();
	}
}
