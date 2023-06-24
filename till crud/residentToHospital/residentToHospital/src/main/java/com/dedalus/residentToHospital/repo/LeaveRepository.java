package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;

import com.dedalus.residentToHospital.entity.LeaveEntity;


public interface LeaveRepository extends CrudRepository<LeaveEntity, Long> {

}
