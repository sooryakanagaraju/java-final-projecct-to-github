package com.dedalus.residentToHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.entity.LoginEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.exception.ResidentAlreadyExistsException;
import com.dedalus.residentToHospital.service.LeaveService;
import com.dedalus.residentToHospital.service.loginService;


@RestController
@RequestMapping("api/login")
public class LoginController {
	@Autowired
	loginService loginservice;
	
	@PostMapping("/createLogin")
    public LoginEntity addLogin(@RequestBody LoginEntity login)
    {
        return loginservice.addLogin(login);

    }
	
	
	
	@GetMapping("/listlogin")
    public List<LoginEntity> getAllLeave() {
    // TODO Auto-generated method stub
		return loginservice.listLogin();
		
	
	
}
}
