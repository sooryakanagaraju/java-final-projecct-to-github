package com.dedalus.residentToHospital.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name="Leave")
public class LeaveEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long leaveId;
	
	
	
	@Column
	private Date leaveDate;
	
	@Column(nullable=false)
	private Long numberOfDaysLeave;
	
	
//	@OneToMany(mappedBy = "leaveentity")
//	private List<ResidentEntity> residentEntity;
	


}
