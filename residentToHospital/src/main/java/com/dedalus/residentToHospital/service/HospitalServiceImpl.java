package com.dedalus.residentToHospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.exception.HospitalNotFoundException;
import com.dedalus.residentToHospital.exception.ResidentNotFoundException;
import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.repo.HospitalRepository;

@Service
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
		Optional<HospitalEntity> optionalhospital = hospitalrepository.findById(hospitalId);
		return optionalhospital.get();
	}

	@Override
	public List<HospitalEntity> getAllHospital() {
		// TODO Auto-generated method stub
		return (List<HospitalEntity>) hospitalrepository.findAll();
	}

	@Override
	public HospitalEntity updateHospital(HospitalEntity hospital) {
		// TODO Auto-generated method stub
		
		HospitalEntity existingHospital = hospitalrepository.findById(hospital.getHospitalId()).get();
		existingHospital.setHospitalName(hospital.getHospitalName());
		existingHospital.setHospitalAddress(hospital.getHospitalAddress());
		existingHospital.setHospitalContactno(hospital.getHospitalContactno());	
		return hospitalrepository.save(existingHospital);
	}
	


	@Override
	public void deleteHospital(Long hospitalId) {
		// TODO Auto-generated method stub
		 
		 if(hospitalrepository.findById(hospitalId).isEmpty())
			{
				throw new HospitalNotFoundException();
			}
			else
		 hospitalrepository.deleteById(hospitalId);
		
	}
	
	
	
		
	}

