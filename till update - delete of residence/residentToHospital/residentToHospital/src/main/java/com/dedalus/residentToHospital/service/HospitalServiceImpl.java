package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.repo.HospitalRepository;


public class HospitalServiceImpl implements HospitalService{

	@Autowired
	HospitalRepository hospitalrepository;

	@Override
	public HospitalEntity createHospital(HospitalEntity hospital) {
		return hospitalrepository.save(hospital);
	}

	@Override
	public HospitalEntity getHospitalById(long hospitalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalEntity> getAllHospital() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HospitalEntity updateHospital(HospitalEntity hospital) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHospital(Long hospitalId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
		
	}

