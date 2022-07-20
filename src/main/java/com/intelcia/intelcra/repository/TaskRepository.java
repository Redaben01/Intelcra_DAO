package com.intelcia.intelcra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelcia.intelcra.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
