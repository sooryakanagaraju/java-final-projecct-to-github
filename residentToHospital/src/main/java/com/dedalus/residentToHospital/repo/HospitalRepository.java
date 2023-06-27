package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;

public interface HospitalRepository extends CrudRepository<HospitalEntity, Long> {

}
