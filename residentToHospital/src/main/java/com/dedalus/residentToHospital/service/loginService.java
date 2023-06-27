package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.LoginEntity;


public interface loginService {

	LoginEntity addLogin(LoginEntity login);
	List<LoginEntity> listLogin();
	
	public String welcome();
	
	
}
