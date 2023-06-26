package com.dedalus.residentToHospital.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.dedalus.residentToHospital.entity.LoginEntity;
import com.dedalus.residentToHospital.repo.LoginRepository;

@Component
public class ResidentToHospitalAuthProvider implements AuthenticationProvider{
	
	@Autowired
	LoginRepository loginrepository;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		LoginEntity login = loginrepository.findByuserName(username);

		if (login == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(login.getPassWord())) {
//			System.out.println("Working,.......");
			return new UsernamePasswordAuthenticationToken(username, pwd,null);
		} else {
			System.out.println("I am a bad credentails");
			throw new StackOverflowError("Invalid Password");
		}
	}

@Override
public boolean supports(Class<?> authentication) {
	return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
}
	
	
}
