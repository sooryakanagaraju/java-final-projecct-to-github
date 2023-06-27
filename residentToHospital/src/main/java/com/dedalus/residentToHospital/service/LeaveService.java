package com.dedalus.residentToHospital.service;

import java.util.List;

import com.dedalus.residentToHospital.entity.LeaveEntity;

public interface LeaveService {

	//DECLARING ALL THE METHODS TO PERFORM CRUD OPERATIONS ON LEAVE TABLE
	
	LeaveEntity createLeave(LeaveEntity leave);
	
	LeaveEntity getLeaveById(long leaveId);
	
	List<LeaveEntity> getAllLeave();
	
	LeaveEntity updateLeave(LeaveEntity leave);
	
	void deleteLeave(Long leaveId);
}
