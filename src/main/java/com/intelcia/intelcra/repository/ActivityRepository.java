package com.intelcia.intelcra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelcia.intelcra.entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Long> {

}
