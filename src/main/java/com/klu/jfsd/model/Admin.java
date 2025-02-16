package com.klu.jfsd.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_table") 
public class Admin {
	
	@Id
	@Column(name = "Admin_username" , nullable = false , unique  = true)
	private String username;
	@Column(name = "Admin_password" , nullable = false , unique = false)
	private String password;
	
	
	//generated.........................>
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
}
