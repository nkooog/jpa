package com.example.jpa.user.service.model.entity;

import com.example.jpa.tenant.service.model.entity.TenantInfo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
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
	private UsersId usersId;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "tenant_id", insertable = false, updatable = false)
	private TenantInfo tenantInfo;

	@Column(name = "scrt_no")
	private String scrt_no;

}
