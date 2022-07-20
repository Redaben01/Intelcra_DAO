package com.intelcia.intelcra.entity;



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
public class Activity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="activity_id")
	private Long activity_Id;
	@ManyToOne
	@JoinColumn (name="sub_dom_id")
	private SubDomain subdomain;
	@Column(length=60 ,name="activity_name")
	private String activityName;
	@Column(name="actitvity_description")
	private String actitvity_Description;
}
	
