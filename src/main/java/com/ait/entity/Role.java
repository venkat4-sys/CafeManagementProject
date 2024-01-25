package com.ait.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ROLE_TBL")
public class Role {
	
	@Id
	private Integer roleId;
	
	private String roleName;
	
	

}
