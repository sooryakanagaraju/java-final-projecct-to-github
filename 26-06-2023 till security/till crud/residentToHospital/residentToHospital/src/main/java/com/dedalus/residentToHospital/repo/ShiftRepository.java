package com.dedalus.residentToHospital.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;

public interface ShiftRepository extends CrudRepository<ShiftEntity, Long> {

	

}
