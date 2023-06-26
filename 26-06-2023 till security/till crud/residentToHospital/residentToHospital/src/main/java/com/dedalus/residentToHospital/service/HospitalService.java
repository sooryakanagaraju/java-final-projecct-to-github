package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.exception.HospitalAlreadyExistsException;



public interface HospitalService
{
 HospitalEntity createHospital( HospitalEntity hospital) throws HospitalAlreadyExistsException;
	
HospitalEntity getHospitalById(long hospitalId);
	
	List<HospitalEntity> getAllHospital();
	
	HospitalEntity updateHospital(HospitalEntity hospital);
	
	void deleteHospital(Long hospitalId);
}
