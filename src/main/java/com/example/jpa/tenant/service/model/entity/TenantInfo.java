package com.example.jpa.tenant.service.model.entity;

import com.example.jpa.user.service.model.entity.Users;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_TENANT_INFO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TenantInfo {

	@Id
	private String tenant_id;

	@Column
	private String dmn_cd;

	@Column
	private String tenant_st_cd;


	@JsonManagedReference
	@OneToMany
	@JoinColumn(name = "tenant_id")
	private List<Users> users = new ArrayList<>();

}
