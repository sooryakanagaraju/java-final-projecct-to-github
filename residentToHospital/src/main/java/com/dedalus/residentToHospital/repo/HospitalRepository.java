package com.dedalus.residentToHospital.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;

public interface HospitalRepository extends CrudRepository<HospitalEntity, Long> {

	
	 Optional<HospitalEntity> findByHospitalContactno(String hospitalContactno);
		List<HospitalEntity> findAll(Sort by);
}
