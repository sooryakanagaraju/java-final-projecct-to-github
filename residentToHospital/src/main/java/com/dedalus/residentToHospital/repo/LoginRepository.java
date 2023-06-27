package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.residentToHospital.entity.LoginEntity;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity, Long> {

	LoginEntity findByuserName(String userName);

}
