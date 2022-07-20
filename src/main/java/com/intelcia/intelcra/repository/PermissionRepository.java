package com.intelcia.intelcra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelcia.intelcra.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission,Long> {

}
