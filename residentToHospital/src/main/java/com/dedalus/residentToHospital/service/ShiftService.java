package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;

public interface ShiftService {
	//DECLARING ALL THE METHODS TO PERFORM CRUD OPERATIONS ON SHIFT TABLE
	
	ShiftEntity createShift( ShiftEntity shiftentity);

	
	List<ShiftEntity> getAllShifts();
	
	ShiftEntity updateShift(ShiftEntity shiftentity);
	
	void deleteShift(Long shiftId);

}
