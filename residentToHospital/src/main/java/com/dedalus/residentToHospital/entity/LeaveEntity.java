package com.dedalus.residentToHospital.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="Leave")
public class LeaveEntity {
	
	@Id
	@GeneratedValue
	private Long leaveId;
	
	
	
	@Column
	private Date leaveDate;
	
	@Column(nullable=false)
	private Long numberOfDaysLeave;
	
	@ManyToOne
	@JoinColumn(name="residentId", referencedColumnName="RESIDENTID")
	public ResidentEntity residentEntity;


}
