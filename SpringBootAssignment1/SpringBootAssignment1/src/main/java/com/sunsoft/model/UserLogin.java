package com.sunsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindetails")
public class UserLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String uname;

	@Column
	private String pass;
	
	public String getUserName() {
		return this.uname;
	}
	
	public String getPassword() {
		return this.pass;
	}
	
	public void setUserName(String uname) {
		this.uname=uname;
	}
	
	public void setPassword(String pass) {
		this.pass=pass;;
	}
}
