package com.dedalus.residentToHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.service.HospitalService;

@RestController
@RequestMapping("api/hospitals")
public class HospitalController {

	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/createHospital")
	 public HospitalEntity createHospital(@RequestBody HospitalEntity hospital)
	 {
		return hospitalService.createHospital(hospital);
	 }
	
	
	
//	@Autowired
//	ResidentService residentservice;
//
//	@PostMapping("/createResident")
//	
//    public ResidentEntity createResident(@RequestBody ResidentEntity resident)
//    {
//        return residentservice.createResident(resident);
//
//    }
	
	@GetMapping("searchHospital/{id}")
	public ResponseEntity<HospitalEntity> getHospitalById(@PathVariable("id") Long hospitalId)
	{
		HospitalEntity _hospital = hospitalService.getHospitalById(hospitalId);
		return new ResponseEntity<>(_hospital,HttpStatus.OK);
	}	
	
	@GetMapping("/listHospital")

    public List<HospitalEntity> getAllHospital() {
        // TODO Auto-generated method stub
		return hospitalService.getAllHospital();
 }
	
	
	@PutMapping("/updateHospital/{id}")
	public ResponseEntity<HospitalEntity> updateHospital(@PathVariable("id") Long hospitalId,@RequestBody HospitalEntity hospital)
	{
		hospital.setHospitalId(hospitalId);	
		HospitalEntity updatedhospital = hospitalService.updateHospital(hospital);
		return new ResponseEntity<>(updatedhospital,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletehospital/{id}")
	public ResponseEntity<String> DeleteHospital(@PathVariable("id") Long hospitalId)
	{		
		hospitalService.deleteHospital(hospitalId);
		return new ResponseEntity<>("hospital successfully deleted!",HttpStatus.OK);
	}
}
