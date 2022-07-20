package com.intelcia.intelcra.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnicalProfil {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tech_profil_id")
	private Long tech_profil_Id;
	@Column(length=60 ,name="tech_profil_name")
	private String tech_profil_Name;
	@Column(name="tech_profil_description")
	private String tech_profil_Description;
	   @OneToMany(mappedBy = "technicalprofil")
	   private Set<TaskProfil> technicalprofils;

}
