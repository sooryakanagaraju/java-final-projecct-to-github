package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.ResidentEntity;



public interface ResidentService {
	ResidentEntity createResident( ResidentEntity resident);
	
	ResidentEntity getResidentById(long residentId);
	
	List<ResidentEntity> getAllResident();
	
	ResidentEntity updateResident(ResidentEntity resident);
	
	void deleteResident(Long residentId);
}