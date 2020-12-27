package com.hm.internal.idm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.internal.idm.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long>{

	List<Permission> findByFeature(String feature);

}
