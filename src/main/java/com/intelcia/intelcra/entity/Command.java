package com.intelcia.intelcra.entity;

import java.math.BigInteger;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Command {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="command_id")
	private Long cmd_Id;
	@ManyToOne
	@JoinColumn (name="activity_id")
	private Activity activity;
	@Column(name="cmd_num")
	private BigInteger commandNum;
	@Column(name="command_start_date")
	private Date cmd_start_Date;
	@Column(name="command_end_date")
	private Date cmd_end_Date;
	@Column(name="command_quantity")
	private String cmd_Quantity;
	@Column(length=60 ,name="command_status")
	private String cmd_Status;
	@ManyToMany
	@JoinTable(
			  name = "command_user", 
			  joinColumns = @JoinColumn(name = "cmd_id"), 
			  inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Collection<User> users;
}
