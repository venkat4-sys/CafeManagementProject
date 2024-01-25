package com.ait.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_TBL")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String contactNumber;
	
	private String password;
	
	private String confirmPassword;
	
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "role_fk", referencedColumnName = "roleId")
	private Role role;
		

}
