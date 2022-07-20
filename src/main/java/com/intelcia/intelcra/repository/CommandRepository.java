package com.intelcia.intelcra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelcia.intelcra.entity.Command;

public interface CommandRepository extends JpaRepository<Command,Long> {

}
