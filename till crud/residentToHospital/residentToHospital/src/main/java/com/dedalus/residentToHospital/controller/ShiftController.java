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
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.service.ShiftService;


@RestController
public class ShiftController {
	@Autowired
	ShiftService shiftservice;

	@PostMapping("/createShift")
    public ShiftEntity createShift(@RequestBody ShiftEntity shiftentity)

    {
        return shiftservice.createShift(shiftentity);
    }

	
	@GetMapping("/listshifts")
    public List<ShiftEntity> getAllShifts() {
    // TODO Auto-generated method stub
		return shiftservice.getAllShifts();
	
}
	
	@PutMapping("{id}")
	public ResponseEntity<ShiftEntity> updateShift(@PathVariable("id") Long shiftId,@RequestBody ShiftEntity shift)
	{
		shift.setShiftId(shiftId);	
		ShiftEntity updatedshift = shiftservice.updateShift(shift);
		return new ResponseEntity<>(updatedshift,HttpStatus.OK);
	}
}