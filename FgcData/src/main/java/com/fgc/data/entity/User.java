package com.fgc.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	String userId;
	
	@Column(nullable = false)
	String username;
	
	@Column(nullable = false)
	String password;
	
	@Column(nullable = false)
	String email;
	
	@Column(nullable = false)
	String access;
	
	@Column(nullable = false)
	Double totalPlusMinus;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public Double getTotalPlusMinus() {
		return totalPlusMinus;
	}

	public void setTotalPlusMinus(Double totalPlusMinus) {
		this.totalPlusMinus = totalPlusMinus;
	}
	
	
	
	

}
