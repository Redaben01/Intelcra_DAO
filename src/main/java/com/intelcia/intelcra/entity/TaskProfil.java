package com.intelcia.intelcra.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskProfil {
	@EmbeddedId
	private TaskProfilId taskprofilId ;
	@ManyToOne
	@MapsId("taskId")
    @JoinColumn(name = "task_id")
    Task task;
	@ManyToOne
	@MapsId("tech_profil_Id")
    @JoinColumn(name = "tech_profil_id")
    private  TechnicalProfil technicalprofil;
	@Column(name="tjm")
	private Long tjm;
	


}
