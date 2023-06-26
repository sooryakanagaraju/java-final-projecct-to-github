package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.repo.LeaveRepository;

@Service
public class LeaveServiceImpl implements LeaveService {

	
	@Autowired
	LeaveRepository leaverepository;

	@Override
	public LeaveEntity createLeave(LeaveEntity leave) {
		// TODO Auto-generated method stub
		 return leaverepository.save(leave);
	}

	@Override
	public LeaveEntity getLeaveById(long leaveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LeaveEntity> getAllLeave() {
		// TODO Auto-generated method stub
		return (List<LeaveEntity>) leaverepository.findAll();
	}

	@Override
	public LeaveEntity updateLeave(LeaveEntity leave) {
		LeaveEntity existingLeave = leaverepository.findById(leave.getLeaveId()).get();
		existingLeave.setLeaveDate(leave.getLeaveDate());
		existingLeave.setNumberOfDaysLeave(leave.getNumberOfDaysLeave());
		return leaverepository.save(existingLeave);
	}

	@Override
	public void deleteLeave(Long leaveId) {
		// TODO Auto-generated method stub
		leaverepository.deleteById(leaveId);
		
	}
	
	
	

}
