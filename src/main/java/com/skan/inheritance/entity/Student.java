package com.skan.inheritance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@Entity @Table(name = "students")
public class Student extends User {

	private String nce;
	
	public Student() {super();}
	
	public Student(String name, String email) {
		super(name, email);
	}
	
	public Student(String name, String email, String nce) {
		super(name, email);
		this.nce = nce;
	}
	
	public String getNce() { 
		return this.nce; 
	}
	
	public void setNce(String nce) {
		this.nce = nce; 
	}

	@Override
	public String toString() {
		return String.format(
			"Student : %s <%s> - %s",
			this.name, this.email, this.nce
		);
	}
	
}
