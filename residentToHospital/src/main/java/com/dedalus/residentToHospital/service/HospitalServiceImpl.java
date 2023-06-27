package com.dedalus.residentToHospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.repo.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService{

	//IMPLEMENTING ALL THE METHODS DECLARED IN HOSPITALSERVICE INTERFACE
	
	@Autowired
	HospitalRepository hospitalrepository;

	@Override
	public HospitalEntity createHospital(HospitalEntity hospital) {				//INSERTING RECORD INTO TABLE
		return hospitalrepository.save(hospital);
	}

	@Override
	public HospitalEntity getHospitalById(long hospitalId) {				//SEARCH RECORD BY ID
		// TODO Auto-generated method stub
		Optional<HospitalEntity> optionalhospital = hospitalrepository.findById(hospitalId);
		return optionalhospital.get();
	}

	@Override
	public List<HospitalEntity> getAllHospital() {							//LISTING ALL RECORDS
		// TODO Auto-generated method stub
		return (List<HospitalEntity>) hospitalrepository.findAll();
	}

	@Override
	public HospitalEntity updateHospital(HospitalEntity hospital) {				//UPDATING RECORD IN THE TABLE
		// TODO Auto-generated method stub
		
		HospitalEntity existingHospital = hospitalrepository.findById(hospital.getHospitalId()).get();
		existingHospital.setHospitalName(hospital.getHospitalName());
		existingHospital.setHospitalAddress(hospital.getHospitalAddress());
		existingHospital.setHospitalContactno(hospital.getHospitalContactno());	
		return hospitalrepository.save(existingHospital);
	}
	


	@Override
		public void deleteHospital(Long hospitalId) {					//DELETING RECORD BY ID
			// TODO Auto-generated method stub
			 hospitalrepository.deleteById(hospitalId);
			
		}
	
	
	
		
	}

