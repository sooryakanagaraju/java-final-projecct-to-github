package com.dedalus.residentToHospital.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Hospital")

public class HospitalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long hospitalId;
	
	@Column(nullable=false)
	private String hospitalName;
	
	@Column(nullable = false)
	private String hospitalAddress;
		
	@Column
	private String hospitalContactno;


//	@OneToMany(mappedBy = "hospital")
//	private List<ResidentEntity> resident;

}
