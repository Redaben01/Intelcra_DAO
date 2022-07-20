package com.intelcia.intelcra.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Absence {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="absence_id")
	private Long absence_Id;
	@ManyToOne
	@JoinColumn (name="user_id")
	private User user;
	@Column(name="absence_start_date")
	private Date absence_start_Date;
	@Column(name="absence_end_date")
	private Date absence_end_Date;
	@Column(length=50 ,name="absence_type")
	private String absence_Type;
}
