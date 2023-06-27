package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.HospitalEntity;



public interface HospitalService
{
	
	//DECLARING ALL THE METHODS TO PERFORM CRUD OPERATIONS ON HOSPITAL TABLE
	
 HospitalEntity createHospital( HospitalEntity hospital);
	
HospitalEntity getHospitalById(long hospitalId);
	
	List<HospitalEntity> getAllHospital();
	
	HospitalEntity updateHospital(HospitalEntity hospital);
	
	void deleteHospital(Long hospitalId);
}
