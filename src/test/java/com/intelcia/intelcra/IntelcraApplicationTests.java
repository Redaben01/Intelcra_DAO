package com.tutorialspoint.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.intelcia.intelcra.entity.User;
import com.intelcia.intelcra.repository.UserRepository;
import com.tutorialspoint.sprintbooth2.SprintBootH2Application;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = SprintBootH2Application.class)
public class IntelcraApplicationTests {
   @Autowired
   private UserRepository userRepository;

   @Test
   public void testFindById() {
	   User user = getUser();	     
	   userRepository.save(user);
	   User result = userRepository.findById(user.getId()).get();
      assertEquals(user.getId(), result.getId());	     
   }
   @Test
   public void testFindAll() {
	   User user = getUser();
      userRepository.save(user);
      List<User> result = new ArrayList<>();
      userRepository.findAll().forEach(e -> result.add(e));
      assertEquals(result.size(), 1);	     
   }
   @Test
   public void testSave() {
	   User user = getUser();
       userRepository.save(user);
       User found = userRepository.findById(user.getId()).get();
       assertEquals(user.getId(), found.getId());	     
   }
   @Test
   public void testDeleteById() {
	   User user = getuser();
      userRepository.save(user);
      userRepository.deleteById(user.getId());
      List<user> result = new ArrayList<>();
      userRepository.findAll().forEach(e -> result.add(e));
      assertEquals(result.size(), 0);
   }
   private User getEmployee() {
	   User user = new User();
	   user.setId(1);
	   user.setTechnicalprofil("Profil Junior")
	   user.setName("Reda");
	   user.setEmail("redabennani.intelcia.com");
      return user;
   }
}