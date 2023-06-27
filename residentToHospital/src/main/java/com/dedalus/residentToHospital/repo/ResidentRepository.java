package com.dedalus.residentToHospital.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.residentToHospital.entity.ResidentEntity;
@Repository
public interface ResidentRepository extends CrudRepository<ResidentEntity, Long> {


	 Optional<ResidentEntity> findByresidentContactno(String residentContactno);

	List<ResidentEntity> findAll(Sort by);


}
