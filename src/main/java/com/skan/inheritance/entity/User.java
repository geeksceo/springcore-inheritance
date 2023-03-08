package com.skan.inheritance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Column(nullable = false)
	protected String name;
	
	@Column(nullable = false)
	protected String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public User() {}
	
}
