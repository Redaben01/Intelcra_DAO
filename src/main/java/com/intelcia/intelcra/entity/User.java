package com.intelcia.intelcra.entity;

import java.sql.Blob;
import java.sql.Date;

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
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long userId;
	@ManyToOne
	@JoinColumn (name="tech_profil_id")
	private TechnicalProfil technicalprofil;
	@ManyToOne
	@JoinColumn (name="role_id")
	private Role role;
	@Column(length=60 ,name="user_matricule")
	private String user_Matricule;
	@Column(length=60 ,name="user_ts_code")
	private String user_ts_Code;
	@Column(length=120 ,name="user_name")
	private String userName;
	@Column(length=15 ,name="phone_number")
	private String phoneNumber;
	@Column(length=120 ,name="email")
	private String Email;
	@Column(name="job")
	private String Job;
	@Column(length=120 ,name="contract_type")
	private String contactType;
	@Column(name="date_integration")
	private Date dateIntegration;
	@Column(name="techno")
	private String Techno;
	@Column(length=120 ,name="rsa_key")
	private String rsaKey;
	@Column(name="date_expiration_rsa")
	private Date date_expiration_Rsa;
	@Column(name="signature")
	private Blob Signature;
}
