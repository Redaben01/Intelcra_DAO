package com.intelcia.intelcra;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.intelcia.intelcra.entity.Role;
import com.intelcia.intelcra.repository.PermissionRepository;
import com.intelcia.intelcra.repository.RoleRepository;
import com.intelcia.intelcra.repository.TaskRepository;
import com.intelcia.intelcra.repository.TechnicalProfilRepository;
import com.intelcia.intelcra.entity.Permission;
@SpringBootApplication
public class IntelcraApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelcraApplication.class, args);
	}
	
	@Autowired
	PermissionRepository permissionRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	TaskRepository taskRepository;
	@Autowired
	TechnicalProfilRepository technicalprofilRepository;

	//TODO 
	 @Bean
	    CommandLineRunner start(){
	        return args -> {
	               Stream.of("Consultant","Responsable","Directeur").forEach(name->{
	               Permission permission=new Permission();
	        	   permission.setPermission_Name(name);
	               permission.setPermission_Description(name);
   				   permissionRepository.save(permission);
   				 @Bean
   			    CommandLineRunner start1(){
   			        return args -> {
   			               Stream.of("Consultation","Génerant de Cra","Super Admin").forEach(name->{
   			               Role role=new role();
   			               role.setRole_Name(name);
   			               role.setRole_Description(name);
   		   				   permissionRepository.save(role);
   		   			 @Bean
   		  	    CommandLineRunner start2(){
   		  	        return args -> {
   		  	               Stream.of("1","2","3").forEach(name->{
   		  	               Task task=new Task();
   		  	               task.setTask_Name(name);
   		  	               task.setTask_Description(name);
   		  	               taskRepository.save(task);
   		     				 @Bean
   		     			    CommandLineRunner start3(){
   		     			        return args -> {
   		     			               Stream.of("Domain Manager","Collaborateur","Consultant").forEach(name->{
   		     			             TechnicalProfil permission=new TechnicalProfil();
   		     			        	 technical_profil.setTechnicalProfil_Name(name);
   		     			        	 technicalprofil.setTechnicalProfil_Description(name);
   		     			             technicalprofilRepository.save(technicalprofil);
   				   
   				   // Roles
   				   
   				   // Tasks
   				   
   				   // Technical Profiles
	           });
	        };
}}
