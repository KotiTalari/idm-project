package com.hm.internal.idm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.internal.idm.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long>{

	void findByFeature(String feature);

}
