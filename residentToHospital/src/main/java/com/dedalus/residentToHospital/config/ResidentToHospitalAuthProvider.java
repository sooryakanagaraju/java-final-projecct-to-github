package com.dedalus.residentToHospital.config;


import java.util.ArrayList;
import java.util.List;

import com.dedalus.residentToHospital.entity.UserPwd;
import com.dedalus.residentToHospital.repo.UserPwdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

//DYNAMIC SECURITY IMPLEMENTATION

@Component
public class ResidentToHospitalAuthProvider implements AuthenticationProvider {

	@Autowired
	UserPwdRepository userpwdrepository;

	
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		System.out.println("Hi");
		System.out.println(username);
		
		UserPwd  userpwd = userpwdrepository.findByusername(username);
				
		if (userpwd == null) {
			throw new StackOverflowError("No user got registered");
		} else if (pwd.equals(userpwd.getPass())) {
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(userpwd.getRole()));
			return new UsernamePasswordAuthenticationToken(username, pwd, authorities);
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