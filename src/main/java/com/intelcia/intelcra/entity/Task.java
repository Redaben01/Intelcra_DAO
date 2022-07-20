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
public class Task {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="task_id")
	private Long taskId;
	@Column(length=60 ,name="task_name")
	private String taskName;
	@Column(name="task_description")
	private String taskDescription;
	 @OneToMany(mappedBy = "task")
	 private Set<TaskProfil> TaskProfils;
}
