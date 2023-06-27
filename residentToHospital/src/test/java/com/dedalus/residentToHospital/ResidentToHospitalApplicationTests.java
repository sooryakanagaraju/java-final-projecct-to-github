package com.dedalus.residentToHospital;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.dedalus.residentToHospital.controller.LoginController;
import com.dedalus.residentToHospital.entity.LoginEntity;
import com.dedalus.residentToHospital.repo.LoginRepository;
import com.dedalus.residentToHospital.service.loginService;

@SpringBootTest
class ResidentToHospitalApplicationTests {

	@Mock
	LoginRepository loginrepository;
	
	@Mock
	loginService loginservice;
	
	@InjectMocks
	private LoginController logincontroller;
	
//		long userid = 1;
//
//		LoginEntity login = new LoginEntity();
//
//		login.setLoginId(userid);
//		login.setUserName("soorya");
//		login.setPassWord("pass");
//		
//		List<LoginEntity> user= Arrays.asList(login);
//		when(loginservice.listLogin()).thenReturn(user);
//		List<LoginEntity> result=logincontroller.getAllLogin();
//	
//		assertEquals(login, result);
		
//		
		
		@Test
		public void testWelcome()
		{
			String res=LoginController.welcome();
			assertEquals("Welcome",res);
		}
	}


