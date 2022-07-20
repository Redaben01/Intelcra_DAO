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
public class Domain {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="domain_id")
	private Long domain_Id;
	@ManyToOne
	@JoinColumn (name="responsible_id")
	//@Column(name="responsible_id")
	private User responsible;
	@Column(length=60 ,name="domain_name")
	private String domainName;
	@Column(name="domain_description")
	private String domain_Description;

}
