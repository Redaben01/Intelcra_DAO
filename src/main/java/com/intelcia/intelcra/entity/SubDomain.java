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
public class SubDomain {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subdomain_id")
	private Long subdomain_Id;
	@ManyToOne
	@JoinColumn (name="domain_id")
	private Domain domain;
	@Column(length=60 ,name="subdomain_name")
	private String subdomain_Name;
	@Column(name="subdomain_description")
	private String subdomain_Description;

}
