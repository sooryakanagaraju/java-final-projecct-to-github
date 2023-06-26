package com.dedalus.residentToHospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.entity.ResidentEntity;
import com.dedalus.residentToHospital.entity.ShiftEntity;
import com.dedalus.residentToHospital.repo.ShiftRepository;

@Service
public class ShiftServiceImpl implements ShiftService {
	
	@Autowired
	ShiftRepository shiftrepository;

	@Override
	public ShiftEntity createShift(ShiftEntity shiftentity) {
		// TODO Auto-generated method stub
		return shiftrepository.save(shiftentity);
	}

	@Override
	public List<ShiftEntity> getAllShifts() {
		// TODO Auto-generated method stub
		return (List<ShiftEntity>) shiftrepository.findAll();	
	}

	@Override
	public ShiftEntity updateShift(ShiftEntity shift) {
		// TODO Auto-generated method stub
		ShiftEntity existingshift = shiftrepository.findById(shift.getShiftId()).get();
		existingshift.setResidentShiftTime(shift.getResidentShiftTime());
		existingshift.setResidentWard(shift.getResidentWard());
		return shiftrepository.save(existingshift);
	}

	@Override
	public void deleteShift(Long shiftId) {
		// TODO Auto-generated method stub
		
	}

	
	

}
