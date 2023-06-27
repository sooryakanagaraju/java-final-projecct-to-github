package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.HospitalEntity;
import com.dedalus.residentToHospital.entity.LeaveEntity;
import com.dedalus.residentToHospital.repo.LeaveRepository;

@Service
public class LeaveServiceImpl implements LeaveService {
	
	//IMPLEMENTING ALL THE METHODS DECLARED IN LEAVESERVICE INTERFACE
	

	
	@Autowired
	LeaveRepository leaverepository;

	@Override
	public LeaveEntity createLeave(LeaveEntity leave) {						//INSERTING RECORD INTO TABLE
		// TODO Auto-generated method stub
		 return leaverepository.save(leave);
	}

	@Override
	public LeaveEntity getLeaveById(long leaveId) {							//SEARCH RECORD BY ID
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LeaveEntity> getAllLeave() {						//LISTING ALL THE RECORDS 
		// TODO Auto-generated method stub
		return (List<LeaveEntity>) leaverepository.findAll();
	}

	@Override
	public LeaveEntity updateLeave(LeaveEntity leave) {					//UPDATING RECORD 
		LeaveEntity existingLeave = leaverepository.findById(leave.getLeaveId()).get();
		existingLeave.setLeaveDate(leave.getLeaveDate());
		existingLeave.setNumberOfDaysLeave(leave.getNumberOfDaysLeave());
		return leaverepository.save(existingLeave);
	}

	@Override
	public void deleteLeave(Long leaveId) {						//DELETING RECORD BY ID
		// TODO Auto-generated method stub
		leaverepository.deleteById(leaveId);
		
	}
	
	
	

}
