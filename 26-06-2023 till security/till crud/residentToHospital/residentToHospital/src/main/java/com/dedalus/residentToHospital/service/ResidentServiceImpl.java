package com.dedalus.residentToHospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.exception.ResidentAlreadyExistsException;
import com.dedalus.residentToHospital.exception.ResidentNotFoundException;
import com.dedalus.residentToHospital.repo.ResidentRepository;

@Service
public class ResidentServiceImpl implements ResidentService {

	@Autowired
	ResidentRepository residentrepository;
	
	
	@Override
	public ResidentEntity createResident(ResidentEntity resident) throws ResidentAlreadyExistsException 
	{
		if(residentrepository.findByresidentContactno(resident.getResidentContactno()).isPresent())
		{
			throw new ResidentAlreadyExistsException();
		}
		else
		{
			  return residentrepository.save(resident);
		}
	  
		// TODO Auto-generated method stub		
	}

	@Override
	public ResidentEntity getResidentById(long residentId) {
		// TODO Auto-generated method stub
		Optional<ResidentEntity> optionalresident = residentrepository.findById(residentId);
		return optionalresident.get();
	}
	

	@Override
	
	public List<ResidentEntity> getAllResident() {
		// TODO Auto-generated method stub
		return (List<ResidentEntity>) residentrepository.findAll();
	}

	@Override
	public ResidentEntity updateResident(ResidentEntity resident) {
		// TODO Auto-generated method stub
//		if(residentrepository.findById(resident.getResidentId()).isEmpty())
//		{
//			throw new PatientNotFoundException();
//		}
//		else
//		{
			ResidentEntity existingresident = residentrepository.findById(resident.getResidentId()).get();
			existingresident.setResidentName(resident.getResidentName());
			existingresident.setResidentAddress(resident.getResidentAddress());
			existingresident.setResidentDoj(resident.getResidentDoj());
			existingresident.setResidentGender(resident.getResidentGender());
			existingresident.setResidentContactno(resident.getResidentContactno());
			existingresident.setResidentEmail(resident.getResidentEmail());
			
			return residentrepository.save(existingresident);
//		}
	}
	
	
//	@Override
//	public Patient updatePatient(Patient patient) throws PatientNotFoundException{
//		if(patientRepository.findById(patient.getPatientid()).isEmpty())
//		{
//			throw new PatientNotFoundException();
//		}
//		else
//		{
//			Patient existingPatient = patientRepository.findById(patient.getPatientid()).get();
//			existingPatient.setPatientfirstname(patient.getPatientfirstname());
//			existingPatient.setPatientlastname(patient.getPatientlastname());
//			existingPatient.setPatientdob(patient.getPatientdob());
//			existingPatient.setPatientgender(patient.getPatientgender());
//			existingPatient.setPatientcontactno(patient.getPatientcontactno());
//			existingPatient.setPatientemailid(patient.getPatientemailid());
//			existingPatient.setPatientaddr1(patient.getPatientaddr1());
//			existingPatient.setPatientaddr2(patient.getPatientaddr2());
//			existingPatient.setStatecode(patient.getStatecode());
//			existingPatient.setPostalcode(patient.getPostalcode());
//			existingPatient.setPatientstatuscode(patient.getPatientstatuscode());		
//			existingPatient.setAadhaarno(patient.getAadhaarno());
//			return patientRepository.save(existingPatient);
//		}
//	}

	
	@Override
	public void deleteResident(Long residentId) throws ResidentNotFoundException {
		// TODO Auto-generated method stub
		if(residentrepository.findById(residentId).isEmpty())
			{
				throw new ResidentNotFoundException();
			}
			else
		 residentrepository.deleteById(residentId);
		
		
	}

	@Override
	public List<ResidentEntity> findByOrderByresidentNameAsc() {
		// TODO Auto-generated method stub
		
		return (List<ResidentEntity>) residentrepository.findAll(Sort.by(Sort.Direction.ASC, "residentName"));
	}


	
	
//	public void deletePatient(Long patientId) throws PatientNotFoundException{
//		if(patientRepository.findById(patientId).isEmpty())
//		{
//			throw new PatientNotFoundException();
//		}
//		else
//		{
//			Patient existingPatient = patientRepository.findById(patientId).get();
//			existingPatient.setActiveind('D');
//			patientRepository.save(existingPatient);
//		}
//	}

	

}
