package com.dedalus.residentToHospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserPwd")
public class UserPwd {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
	@Column (nullable = false)
	private String username;
	
	@Column (nullable = false)
	private String pass;
	
	@Column (nullable = false)
	private String role;

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	@Override
	public String toString() {
		return "UserPwd [userid=" + userid + ", username=" + username + ", pass=" + pass + ", role=" + role + "]";
	}

	public UserPwd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPwd(Long userid, String username, String pass, String role) {
		super();
		this.userid = userid;
		this.username = username;
		this.pass = pass;
		this.role = role;
	}

	
	
}
