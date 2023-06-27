package com.dedalus.residentToHospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.exception.ResidentAlreadyExistsException;



public interface ResidentService {
	
	ResidentEntity createResident(ResidentEntity resident) throws ResidentAlreadyExistsException ;
	
	ResidentEntity getResidentById(long residentId);
	
	List<ResidentEntity> getAllResident();
	
	ResidentEntity updateResident(ResidentEntity resident);
	
	void deleteResident(Long residentId);
	
	List<ResidentEntity> findByOrderByresidentNameAsc();
}