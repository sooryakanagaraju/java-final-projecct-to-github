package com.dedalus.residentToHospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.service.LeaveService;


@RestController
public class LeaveController {
	@Autowired
	LeaveService leaveservice;

	@PostMapping("/createLeave")
    public LeaveEntity createLeave(@RequestBody LeaveEntity leave)

    {

        return leaveservice.createLeave(leave);

    }
	
	@GetMapping("/listleave")
    public List<LeaveEntity> getAllLeave() {
    // TODO Auto-generated method stub
		return leaveservice.getAllLeave();
	
}

}
