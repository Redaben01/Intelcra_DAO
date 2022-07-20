package com.intelcia.intelcra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelcia.intelcra.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
