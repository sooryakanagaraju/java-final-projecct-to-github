package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.repo.ResidentRepository;

@Service
public class ResidentServiceImpl implements ResidentService {

	@Autowired
	ResidentRepository residentrepository;
	
	
	@Override
	public ResidentEntity createResident(ResidentEntity resident) {
	    return residentrepository.save(resident);
		// TODO Auto-generated method stub		
	}

	@Override
	public ResidentEntity getResidentById(long residentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentEntity> getAllResident() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResidentEntity updateResident(ResidentEntity resident) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteResident(Long residentId) {
		// TODO Auto-generated method stub
		
	}

}
