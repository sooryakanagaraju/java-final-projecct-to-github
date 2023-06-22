package com.dedalus.residentToHospital.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Shift")

public class ShiftEntity {
	
	@Id
	@GeneratedValue
	private Long shiftId;
	

	@Column(nullable=false)
	private Date residentShiftTime;
	
	@Column(nullable=false)
	private String residentWard;
	
	@ManyToOne
	@JoinColumn(name="residentId", referencedColumnName="RESIDENTID")
	public ResidentEntity residentEntity;

	
	

}
