package com.intelcia.intelcra.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskProfilId implements Serializable  {

	@Column(name="tech_profil_id")
	private Long tech_profil_Id;
	@Column(name="task_id")
	private Long task_Id;
}