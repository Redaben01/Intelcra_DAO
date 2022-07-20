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
public class Cra {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cra_id")
	private Long cra_Id;
	@ManyToOne
	@JoinColumn (name="activity_id")
	private Activity activity;
	@ManyToOne
	@JoinColumn (name="user_id")
	private User user;
	@Column(name="histo_operation_date")
	private Date histo_operation_Date;
	@Column(name="histo_start_operation_date")
	private Date histo_start_operation_Date;
	@Column(name="histo_end_operation_date")
	private Date histo_end_operation_Date;
	@Column(length=60 ,name="histo_status_cra")
	private String histo_status_cra;
	@Column( name="histo_comment")
	private String histo_comment;
	
	
}
