package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.HospitalEntity;



public interface HospitalService
{
 HospitalEntity createHospital( HospitalEntity hospital);
	
HospitalEntity getHospitalById(long hospitalId);
	
	List<HospitalEntity> getAllHospital();
	
	HospitalEntity updateHospital(HospitalEntity hospital);
	
	void deleteHospital(Long hospitalId);
}
