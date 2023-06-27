package com.dedalus.residentToHospital.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.residentToHospital.entity.ResidentEntity;
@Repository
public interface ResidentRepository extends CrudRepository<ResidentEntity, Long> {

}
