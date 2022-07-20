package com.intelcia.intelcra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="permission_id")
	private Long permission_Id;
	@Column(length=60 ,name="permission_name")
	private String permission_Name;
	@Column(name="permission_description")
	private String permission_Description;

}
