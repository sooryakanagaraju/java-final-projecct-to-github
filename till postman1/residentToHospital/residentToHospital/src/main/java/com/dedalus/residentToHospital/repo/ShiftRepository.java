package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;

import com.dedalus.residentToHospital.entity.ResidentEntity;

public interface ShiftRepository extends CrudRepository<ResidentEntity, Long>{

}
