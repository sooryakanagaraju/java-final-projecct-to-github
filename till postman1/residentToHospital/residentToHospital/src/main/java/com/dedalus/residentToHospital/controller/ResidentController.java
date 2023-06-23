package com.dedalus.residentToHospital.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.service.ResidentService;

@RestController
public class ResidentController {
	
	@Autowired
	ResidentService residentservice;

	@PostMapping("/createResident")
	
    public ResidentEntity createResident(@RequestBody ResidentEntity resident)

    {

        return residentservice.createResident(resident);

    }
	
}
