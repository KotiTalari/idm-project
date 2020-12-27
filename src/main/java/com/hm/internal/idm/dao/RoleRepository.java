package com.hm.internal.idm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.internal.idm.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByDescription(String Description );
	//List<Role> getAllRolesByPermissions();
}
