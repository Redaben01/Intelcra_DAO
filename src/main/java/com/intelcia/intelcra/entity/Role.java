package com.intelcia.intelcra.entity;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private Long role_Id;
	@Column(length=60 ,name="role_name")
	private String role_Name;
	@Column(name="role_description")
	private String role_Description;
	@ManyToMany
	@JoinTable(
			  name = "role_permission", 
			  joinColumns = @JoinColumn(name = "role_id"), 
			  inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private Collection<Permission> permissions;
}
