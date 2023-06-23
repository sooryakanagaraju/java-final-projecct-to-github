package com.dedalus.residentToHospital.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.service.ResidentService;

@RestController
@RequestMapping("api/residents")
public class ResidentController {
	
	@Autowired
	ResidentService residentservice;

	@PostMapping("/createResident")
	
    public ResidentEntity createResident(@RequestBody ResidentEntity resident)
    {
        return residentservice.createResident(resident);

    }
	
	@GetMapping("/listresident")

    public List<ResidentEntity> getAllResident() {
        // TODO Auto-generated method stub
		return residentservice.getAllResident();
 }
	
	@GetMapping("{id}")
	public ResponseEntity<ResidentEntity> getResidentById(@PathVariable("id") Long residentId)
	{
		ResidentEntity _resident = residentservice.getResidentById(residentId);
		return new ResponseEntity<>(_resident,HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ResidentEntity> updateResident(@PathVariable("id") Long residentId,@RequestBody ResidentEntity resident)
	{
		resident.setResidentId(residentId);	
		ResidentEntity updatedresident = residentservice.updateResident(resident);
		return new ResponseEntity<>(updatedresident,HttpStatus.OK);
	}
	
//	@PutMapping("{id}")
//	public ResponseEntity<Patient> UpdatePatient(@PathVariable("id") Long patientId,@RequestBody Patient patient)
//	{
//		patient.setPatientid(patientId);		
//		Patient updatedPatient = patientService.updatePatient(patient);
//		return new ResponseEntity<>(updatedPatient,HttpStatus.OK);
//	}
	
	
}
