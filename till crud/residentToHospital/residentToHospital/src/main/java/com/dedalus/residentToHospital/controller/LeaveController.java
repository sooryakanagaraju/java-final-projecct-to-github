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

import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.service.LeaveService;


@RestController
@RequestMapping("api/leave")
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
	
	@PutMapping("/updateleave/{id}")
	public ResponseEntity<LeaveEntity> updateLeave(@PathVariable("id") Long leaveId,@RequestBody LeaveEntity leave)
	{
		leave.setLeaveId(leaveId);	
		LeaveEntity updatedleave = leaveservice.updateLeave(leave);
		return new ResponseEntity<>(updatedleave,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteleave/{id}")
	public ResponseEntity<String> DeleteLeave(@PathVariable("id") Long leaveId)
	{		
		leaveservice.deleteLeave(leaveId);
		return new ResponseEntity<>("leave successfully deleted!",HttpStatus.OK);
	}

}
