package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.residentToHospital.entity.UserPwd;


@Repository
public interface UserPwdRepository extends CrudRepository<UserPwd, Long> {
	public UserPwd findByusername(String username);
}
