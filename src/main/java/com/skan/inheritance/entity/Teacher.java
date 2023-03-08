package com.skan.inheritance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@Entity @Table(name = "teachers")
public class Teacher extends User{

	private String matricule;
	private String grade;
	
	public Teacher() {super();}
	public Teacher(String name, String email) {
		super(name, email);
	}
	
	public Teacher(String name, String email, String matricule) {
		super(name, email);
		this.matricule = matricule;
	}
	
	public Teacher(String name, String email, String matricule, String grade) {
		this(name, email, matricule);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format(
			"Teacher : %s <%s> - %s",
			this.name, this.email, this.matricule
		);
	}
	
}
