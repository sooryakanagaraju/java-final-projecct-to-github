package com.dedalus.residentToHospital.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
@Table(name="Resident")

public class ResidentEntity {



	@Id
	@GeneratedValue
	private Long residentId;
	
	@Column(nullable=false)
	private String residentName;
	
	@Column(nullable = false)
	private String residentAddress;
	
	@Column(nullable = false)
	private Date residentDoj;
	
	@Column(nullable = false)
	private String residentGender;
	
	@Column
	private String residentContactno;
	
	@Column
	private String residentEmail;
	
	@ManyToOne
	@JoinColumn(name="hospitalId" , referencedColumnName = "HOSPITALID")
	public HospitalEntity hospital;
	

	@OneToMany(mappedBy = "residentEntity")
	private List<ShiftEntity> shiftEntity;

	
}


