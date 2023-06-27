package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.entity.LoginEntity;

import com.dedalus.residentToHospital.repo.LoginRepository;


@Service
public class LoginServiceImpl implements loginService {

	@Autowired
	LoginRepository loginrepository;
	
	@Override
	public LoginEntity addLogin(LoginEntity login) {
		// TODO Auto-generated method stub
		 return loginrepository.save(login);
	}
	

	@Override
	public List<LoginEntity> listLogin() {
		// TODO Auto-generated method stub
		return (List<LoginEntity>) loginrepository.findAll();
	}
	
	public String welcome()
	{
		return "Welcome";
	}
	
	

}
